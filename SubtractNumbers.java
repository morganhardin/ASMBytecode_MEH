// imports utilities and asm libraries to be used
import static utils.Utilities.writeFile;
import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes.*;

/** SubtractNumbers uses the asm library to write lower level code to 
    subtract integers, floats, doubles, and longs and return the difference */
public class SubtractNumbers 
{
    // main method to execute code
    public static void main(String[] args)
    {
        // instantiating the class as a child of Java Object
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "SubtractNumbers", null, "java/lang/Object", null);

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

            // creating, storing, subtracting, and loading two integers
            mv.visitLdcInsn((Integer)293842);
            mv.visitVarInsn(Opcodes.ISTORE, 1);
            mv.visitLdcInsn((Integer)139535);
            mv.visitVarInsn(Opcodes.ISTORE, 2);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitInsn(Opcodes.ISUB);
            mv.visitVarInsn(Opcodes.ISTORE, 3);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);

            // creating, storing, subtracting, and loading two floats
            mv.visitLdcInsn((float)88394.18);
            mv.visitVarInsn(Opcodes.FSTORE, 4);
            mv.visitLdcInsn((float)19395.285);
            mv.visitVarInsn(Opcodes.FSTORE, 5);
            mv.visitVarInsn(Opcodes.FLOAD, 4);
            mv.visitVarInsn(Opcodes.FLOAD, 5);
            mv.visitInsn(Opcodes.FSUB);
            mv.visitVarInsn(Opcodes.FSTORE, 6);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.FLOAD, 6);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(F)V", false);

            // creating, storing, subtracting, and loading two doubles
            mv.visitLdcInsn((double)639013.7654321);
            mv.visitVarInsn(Opcodes.DSTORE, 7);
            mv.visitLdcInsn((double)492374.1286423);
            mv.visitVarInsn(Opcodes.DSTORE, 9);
            mv.visitVarInsn(Opcodes.DLOAD, 7);
            mv.visitVarInsn(Opcodes.DLOAD, 9);
            mv.visitInsn(Opcodes.DSUB);
            mv.visitVarInsn(Opcodes.DSTORE, 11);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.DLOAD, 11);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(D)V", false);

            // creating, storing, subtracting, and loading two longs
            mv.visitLdcInsn((long)76543);
            mv.visitVarInsn(Opcodes.LSTORE, 13);
            mv.visitLdcInsn((long)65432);
            mv.visitVarInsn(Opcodes.LSTORE, 15);
            mv.visitVarInsn(Opcodes.LLOAD, 13);
            mv.visitVarInsn(Opcodes.LLOAD, 15);
            mv.visitInsn(Opcodes.LSUB);
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
        writeFile(b, "SubtractNumbers.class");

        System.out.println("Done");
    } // end main
} // end class