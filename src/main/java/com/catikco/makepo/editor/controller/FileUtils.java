package com.catikco.makepo.editor.controller;

import com.catikco.makepo.editor.Sys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



/**
 * @author janhang
 * @2010-12-15 下午03:26:52
 */
public class FileUtils {
	/**
	 * 创建文件夹并获取文件夹路径
	 * @param	文件或文件夹路径
	 * @return	文件夹路径
	 */
	public String createDir(String path) {
		String p = path;
		String dir = "";
		File dirFile = null;
		String sep = System.getProperties().getProperty("file.separator");
		
		int i = 0;
		while (true) {
			if (null == p)
				break;
			i = -1 != p.indexOf(sep) ? p.indexOf(sep) : p.length();
			
			if ((-1 == p.indexOf(sep) && -1 != p.indexOf('.')) || p.length() == 0)
				break;
			
			dir += p.substring(0, i) + sep;
			if (-1 != p.indexOf(sep))
				p = p.substring(i + 1, p.length());
			else 
				p = null;
			dirFile = new File(dir);
			if (!dirFile.exists() && !dirFile.isDirectory()) {
				dirFile.mkdirs();
			}
		}
		
		return dir;
	}
	
	public boolean createFile(String path, byte[] content) {
		File file = new File(path);
		
		if (!file.exists() && !file.isFile()) {
			String sep = System.getProperties().getProperty("file.separator");
			String dir = path.substring(0, path.lastIndexOf(sep));
			createDir(dir);
		}
		
		FileOutputStream fo = null;
		try {
//			file.createNewFile();
			fo = new FileOutputStream(file);
			fo.write(content);
			fo.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 将指定内容写入指定路径的文件，如果文件不存在就先创建
	 * @param	文件路径
	 * @param	文件内容
	 * @param	是否追加
	 * @return	是否写入成功
	 */
	public boolean createFile(String path, String content, boolean append) {
		File file = new File(path);
		
		if (!file.exists() && !file.isFile()) {
			String sep = System.getProperties().getProperty("file.separator");
			String dir = path.substring(0, path.lastIndexOf(sep));
			createDir(dir);
		}
		
		OutputStreamWriter write = null;
		try {
			write = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
			BufferedWriter writer=new BufferedWriter(write);
			writer.write(content);
			writer.close();
		    return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 为指定文件对象创建目录
	 * @param	文件对象
	 * @return	是否创建成功
	 */
	public boolean createFile(File file) {
		String path = file.getPath();
		if (!file.exists() && !file.isFile()) {
			String sep = System.getProperties().getProperty("file.separator");
			String dir = path.substring(0, path.lastIndexOf(sep));
			createDir(dir);
			return true;
		}
		return false;
	}
	
	
	/**
	 * 获取指定路径下的文件内容
	 * @param	文件路径
	 * @return	内容
	 */
	public String getFileContent(String path) {
		String result = "";
		InputStreamReader read = null;
		BufferedReader reader = null;
		try {
			File f = new File(path);
			if (!f.exists())
				return null;
			read = new InputStreamReader(new FileInputStream(f),"UTF-8");
			reader = new BufferedReader(read);
			String line = null;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
			
			reader.close();
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return result;
	}
	
	/**
	 * 获取文件的byte数组
	 * @param	文件路径
	 * @return	byte数组
	 */
	public byte[] getByte1(String filePath) {
		File file = new File(filePath);
		if (!file.exists())
			return null;
		long fileSize = file.length();
		if (fileSize > Integer.MAX_VALUE) {
			System.out.println("文件过大，无法读取");
			return null;
		}
		byte[] buffer = null;
		try {
			FileInputStream fi = new FileInputStream(file);
			buffer = new byte[(int) fileSize];
			int offset = 0;
			int numRead = 0;
			while (offset < buffer.length && (numRead = fi.read(buffer, offset, buffer.length - offset)) >= 0) {
				offset += numRead;
			}
			// 确保所有数据均被读取
			if (offset != buffer.length) {
				System.out.println("文件长度错误");
			}
			fi.close();
			return buffer;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取文件的byte数组
	 * @param	文件路径
	 * @return	byte数组
	 */
	public byte[] getByte2(String filePath) {
		try {
			FileInputStream in = new FileInputStream(filePath);
			ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
			byte[] temp = new byte[1024];
			int size = 0;
			while ((size = in.read(temp)) != -1) {
				out.write(temp, 0, size);
			}
			in.close();
			byte[] bytes = out.toByteArray();
			return bytes;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 根据前缀替换指定文件中的一行
	 * @param	文件完整路径
	 * @param	要替换的行的前缀
	 * @param	该行替换后的值
	 * @return	是否替换成功
	 */
	public boolean replaceLineToFileByPrefix(String path, String prefix, String newLine) {
		String result = "";
		InputStreamReader read = null;
		BufferedReader reader = null;
		
		String oldLine = null;
		try {
			File f = new File(path);
			if (!f.exists())
				return false;
			read = new InputStreamReader (new FileInputStream(f), "UTF-8");
			reader = new BufferedReader(read);
			String line = null;
			while ((line = reader.readLine()) != null) {
				result += line + "\r\n";
				if (line.indexOf(prefix) == 0) {
					oldLine = line;
				}
			}
			reader.close();
			read.close();
			
			if (null == oldLine)
				return false;
			
			result = result.replace(oldLine, newLine);
			return createFile(path, result, false);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}
	
	public boolean delete(String path) {
		File f = new File(path);
		if (f.exists())
			if (f.delete())
				return true;
			else
				return false;
		return false;
	}
	
	public static String getExt(String filename) {
		if (filename == null || "".equals(filename) || !filename.contains(".")) return null;
		return filename.substring(filename.lastIndexOf(".") + 1, filename.length());
	}
	
	public static boolean isImg(String ext) {
		if (null == ext || Sys.NONE.equals(ext))
			return false;
		
		String ext1 = ext.toUpperCase();
		if (ext1.equals(Sys.JPG)
				|| ext1.equals(Sys.GIF)
				|| ext1.equals(Sys.JPEG)
				|| ext1.equals(Sys.BMP)
				|| ext1.equals(Sys.PNG)
				|| ext1.equals(Sys.ICO)) {
			return true;
		}
		return false;
	}
	
	public static boolean isOffice(String ext) {
		if (null == ext || Sys.NONE.equals(ext))
			return false;
		
		String ext1 = ext.toUpperCase();
		if (ext1.equals(Sys.DOC) || ext1.equals(Sys.DOCX) 
				|| ext1.equals(Sys.XLS) || ext1.equals(Sys.XLSX)
				|| ext1.equals(Sys.PPT) || ext1.equals(Sys.PPTX)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 生成json文件
	 * @param directory 文件夹目录
	 * @param fileName 文件名带后缀
	 * @param json json字符串
	 */
	public static void createJsonFile(String directory, String fileName, String json){
		File file=new File(directory);  
	    if (!file.exists()) {  
	        file.mkdirs();  
	    }  
	    File file2=new File(directory, fileName);  
	    if (!file2.exists()) {  
	        try {  
	            file2.createNewFile();
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }
		FileWriter fileWriter;  
	    try {  
	        fileWriter = new FileWriter(directory + fileName);  
	        //使用缓冲区比不使用缓冲区效果更好，因为每趟磁盘操作都比内存操作要花费更多时间。  
	        //通过BufferedWriter和FileWriter的连接，BufferedWriter可以暂存一堆数据，然后到满时再实际写入磁盘  
	        //这样就可以减少对磁盘操作的次数。如果想要强制把缓冲区立即写入,只要调用writer.flush();这个方法就可以要求缓冲区马上把内容写下去  
	        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);  
	        bufferedWriter.write(json);  
	        bufferedWriter.flush();
	        bufferedWriter.close();
	        fileWriter.close();  
	    } catch (IOException e) {  
	        // TODO Auto-generated catch block  
	        e.printStackTrace();  
	    }
	}
}
