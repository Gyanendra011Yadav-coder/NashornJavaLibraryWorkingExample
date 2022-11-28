import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created By:  Gyanendra_Yadav
 * on ${DATE},${MONTH_NAME_SHORT},${YEAR}
 * in Project: ${PROJECT_NAME}
 *
 *
 * ******************************************************************************
 * Always Add Javascript file in the project directory directly (e.g. Right click on the project name at the top left corner and paste it there).
 *
 * ******************************************************************************
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
//        calling Library
        engine.eval(new FileReader("C:/Adda52/NashornTestingProject/lib/sfs2x-api-1.7.11.js"));
        engine.eval(new FileReader("main.js"));




        //
//        String filepath="C:/Adda52/NashornTestingProject/lib/sfs2x-api-1.7.11";
//        engine.eval("load('"+filepath+"')");
        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("function1", ", This is testing code of Nashorn...");
        Object result2 = invocable.invokeFunction("function2");
        System.out.println(result);
        System.out.println(result2);
    }
}