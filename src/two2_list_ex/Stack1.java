package two2_list_ex;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		// 
		Stack<String>studentNames = new Stack<String>();
		studentNames.push("1");
		studentNames.push("2");
		studentNames.push("3");
		
	}

}

/*
 * 错误信息
 * "The import java.util.Stack conflicts with a type defined in the same file"
 * 通常发生在当前文件中存在一个与 java.util.Stack 同名的类型定义，导致冲突。
 * 
 * 为了解决这个问题，你可以执行以下操作之一：
 * 
 * 重命名冲突的类/接口：如果你在当前文件中定义了一个与 java.util.Stack 同名的类或接口，考虑将你的类/接口重命名为其他名称，避免冲突。
 * 
 * 移除冲突的类/接口：如果当前文件中定义的类或接口不需要的话，你可以直接将它移除，这样 java.util.Stack 的导入语句就可以正常工作了。
 */
