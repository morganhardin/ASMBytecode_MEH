// imports utilities and asm libraries to be used
import static utils.Utilities.writeFile;
import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes;

/** MultiplyNumbers uses the asm library to write lower level code to 
    multiply integers, floats, doubles, and longs and return the product */
public class MultiplyNumbers 
{
    // main method to execute code
    public static void main(String[] args)
    {
        // instantiating the class as a child of Java Object
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "MultiplyNumbers", null, "java/lang/Object", null);

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

            // creating, storing, multiplying, and loading two integers
            mv.visitLdcInsn((Integer)6584);
            mv.visitVarInsn(Opcodes.ISTORE, 1);
            mv.visitLdcInsn((Integer)3916);
            mv.visitVarInsn(Opcodes.ISTORE, 2);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitInsn(Opcodes.IMUL);
            mv.visitVarInsn(Opcodes.ISTORE, 3);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);

            // creating, storing, multiplying, and loading two floats
            mv.visitLdcInsn((float)87.39);
            mv.visitVarInsn(Opcodes.FSTORE, 4);
            mv.visitLdcInsn((float)92.17);
            mv.visitVarInsn(Opcodes.FSTORE, 5);
            mv.visitVarInsn(Opcodes.FLOAD, 4);
            mv.visitVarInsn(Opcodes.FLOAD, 5);
            mv.visitInsn(Opcodes.FMUL);
            mv.visitVarInsn(Opcodes.FSTORE, 6);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.FLOAD, 6);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(F)V", false);

            // creating, storing, multiplying, and loading two doubles
            mv.visitLdcInsn((double)82.123);
            mv.visitVarInsn(Opcodes.DSTORE, 7);
            mv.visitLdcInsn((double)23.987);
            mv.visitVarInsn(Opcodes.DSTORE, 9);
            mv.visitVarInsn(Opcodes.DLOAD, 7);
            mv.visitVarInsn(Opcodes.DLOAD, 9);
            mv.visitInsn(Opcodes.DMUL);
            mv.visitVarInsn(Opcodes.DSTORE, 11);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.DLOAD, 11);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(D)V", false);

            // creating, storing, multiplying, and loading two longs
            mv.visitLdcInsn((long)1234);
            mv.visitVarInsn(Opcodes.LSTORE, 13);
            mv.visitLdcInsn((long)5678);
            mv.visitVarInsn(Opcodes.LSTORE, 15);
            mv.visitVarInsn(Opcodes.LLOAD, 13);
            mv.visitVarInsn(Opcodes.LLOAD, 15);
            mv.visitInsn(Opcodes.LMUL);
            mv.visitVarInsn(Opcodes.LSTORE, 17);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.LLOAD, 17);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V", false);

            // final return statement
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(3,7);
            mv.visitEnd();
        }

        // writes class file and prints "Done" when compiled
        cw.visitEnd();
        byte b [] = cw.toByteArray();
        writeFile(b, "MultiplyNumbers.class");

        System.out.println("Done");
    } // end main
} // end class