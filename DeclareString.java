// imports utilities and asm libraries to be used
import static utils.Utilities.writeFile;
import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes;

/** DeclareString uses the asm library to write lower level code to 
    declare, store, load, and return a string */
public class DeclareString
{
    // main method to execute code
    public static void main(String[] args)
    {
        // instantiating the class as a child of Java Object
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "DeclareString", null, "java/lang/Object", null);

        {
            // creation of the constructor
            MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(1,1);
            mv.visitEnd();
        }
        {
            // creation of the main method to execute code
            MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
            mv.visitCode();

            // declares, stores, and loads a string
            mv.visitLdcInsn((String)"Hello!");
            mv.visitVarInsn(Opcodes.ASTORE, 1);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ALOAD, 1);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

            // final return statement
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(3,7);
            mv.visitEnd();
        }

        // writes class file and prints "Done" when compiled
        cw.visitEnd();
        byte b [] = cw.toByteArray();
        writeFile(b, "DeclareString.class");

        System.out.println("Done");
    } // end main
} // end class