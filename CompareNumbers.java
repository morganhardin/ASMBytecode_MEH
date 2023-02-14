// imports utilities and asm libraries to be used
import static utils.Utilities.writeFile;
import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes;

/** CompareNumbers uses the asm library to write lower level code to 
    compare two integers, shorts, and longs and return the greatest
    of the two's value */
public class CompareNumbers
{
    // main method to execute code
    public static void main(String[] args)
    {
        // instantiating the class as a child of Java Object
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "CompareNumbers", null, "java/lang/Object", null);

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

            /** comparing integers using labels and jumps and
                returning the greater of the two */
            Label endINT1 = new Label();
            Label endINT2 = new Label();

            mv.visitLdcInsn((Integer)918375);
            mv.visitVarInsn(Opcodes.ISTORE, 1);
            mv.visitLdcInsn((Integer)174891);
            mv.visitVarInsn(Opcodes.ISTORE, 2);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endINT1);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitLabel(endINT1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endINT2);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitLabel(endINT2);

            /** comparing shorts using labels and jumps and
                returning the greater of the two */
            Label endSHORT1 = new Label();
            Label endSHORT2 = new Label();

            mv.visitIntInsn(Opcodes.SIPUSH, 1283);
            mv.visitVarInsn(Opcodes.ISTORE, 3);
            mv.visitIntInsn(Opcodes.SIPUSH, 2749);
            mv.visitVarInsn(Opcodes.ISTORE, 4);
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endSHORT1);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitLabel(endSHORT1);
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endSHORT2);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitLabel(endSHORT2);

            /** comparing longs using labels and jumps and
                returning the greater of the two */
            Label endLONG1 = new Label();
            Label endLONG2 = new Label();

            mv.visitLdcInsn((long)987643);
            mv.visitVarInsn(Opcodes.LSTORE, 5);
            mv.visitLdcInsn((long)247394);
            mv.visitVarInsn(Opcodes.LSTORE, 7);
            mv.visitVarInsn(Opcodes.LLOAD, 5);
            mv.visitInsn(Opcodes.L2I);
            mv.visitVarInsn(Opcodes.ISTORE, 9);
            mv.visitVarInsn(Opcodes.LLOAD, 7);
            mv.visitInsn(Opcodes.L2I);
            mv.visitVarInsn(Opcodes.ISTORE, 10);
            mv.visitVarInsn(Opcodes.ILOAD, 9);
            mv.visitVarInsn(Opcodes.ILOAD, 10);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endLONG1);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.LLOAD, 5);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V", false);
            mv.visitLabel(endLONG1);
            mv.visitVarInsn(Opcodes.ILOAD, 10);
            mv.visitVarInsn(Opcodes.ILOAD, 9);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, endLONG2);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.LLOAD, 7);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V", false);
            mv.visitLabel(endLONG2);

            // final return statement
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(3,7);
            mv.visitEnd();
        }

        // writes class file  and prints "Done" when compiled
        cw.visitEnd();
        byte b [] = cw.toByteArray();
        writeFile(b, "CompareNumbers.class");

        System.out.println("Done");
    } // end main
} // end class
