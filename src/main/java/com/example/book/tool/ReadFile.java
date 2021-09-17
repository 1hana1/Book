package com.example.book.tool;

import com.example.book.entity.Book;
import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Object> readFile(String fname) {
        String workPath = ReadFile.class.getClassLoader().getResource(".").getPath();
        String jsonPath = workPath + "/" + fname + ".json";
        String content = "";
        List<Object> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(jsonPath);
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                content += (char) ch;
            }
            fr.close();
            JSONObject jsonObject = JSONObject.fromObject(content);
            list.add(JSONObject.toBean(jsonObject, Book.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
