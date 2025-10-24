package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sealed.VecchioPunto;

public class ReflectionDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

		VecchioPunto vp = new VecchioPunto(3, 2);
		
		Class<? extends VecchioPunto> classe = vp.getClass();
		
		Field[] declaredFields = classe.getDeclaredFields();
		
		for (Field field : declaredFields) {
			
			if (field.getName() == "x") {
				System.out.println("sono il campo x");
				field.setAccessible(true);
				field.set(vp, 5);
			}
			
		}
		
		System.out.println(vp);
		
		Method[] metodi = classe.getDeclaredMethods();
		
		for (Method method : metodi) {
			
			if (method.getName().equals("getX")) {
				System.out.println(  method.invoke(vp, null)  );
			}
			
			
		}
		
		
	}

}
