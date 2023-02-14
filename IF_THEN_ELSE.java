// imports utilities and asm libraries to be used
import static utils.Utilities.writeFile;
import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes;

/** IF_THEN_ELSE uses the asm library to write lower level
    code to take two integers and compare them, printing
    which is greater or if they are equal */
public class IF_THEN_ELSE
{
    // main method to execute code
    public static void main(String[] args)
    {
        // instantiating the class as a child of Java Object
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "IF_THEN_ELSE", null, "java/lang/Object", null);

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

            // comparing integers with labels and jumps
            Label elseifINT = new Label();
            Label elseINT = new Label();
            Label endINT = new Label();

            mv.visitLdcInsn((Integer)81733);
            mv.visitVarInsn(Opcodes.ISTORE, 1);
            mv.visitLdcInsn((Integer)67396);
            mv.visitVarInsn(Opcodes.ISTORE, 2);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, elseifINT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endINT);
            mv.visitLabel(elseifINT);
            mv.visitVarInsn(Opcodes.ILOAD, 1);
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitJumpInsn(Opcodes.IF_ICMPGE, elseINT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 2);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endINT);
            mv.visitLabel(elseINT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitLdcInsn((String)"Both are Equal");
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            mv.visitLabel(endINT);

            // comparing shorts using labels and jumps
            Label elseifSHORT = new Label();
            Label elseSHORT = new Label();
            Label endSHORT = new Label();

            mv.visitIntInsn(Opcodes.SIPUSH, 695);
            mv.visitVarInsn(Opcodes.ISTORE, 3);
            mv.visitIntInsn(Opcodes.SIPUSH, 957);
            mv.visitVarInsn(Opcodes.ISTORE, 4);
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, elseifSHORT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endSHORT);
            mv.visitLabel(elseifSHORT);
            mv.visitVarInsn(Opcodes.ILOAD, 3);
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitJumpInsn(Opcodes.IF_ICMPGE, elseSHORT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ILOAD, 4);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endSHORT);
            mv.visitLabel(elseSHORT);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitLdcInsn((String)"Both are Equal");
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            mv.visitLabel(endSHORT);

            // comparing longs using labels and jumps
            Label elseifLONG = new Label();
            Label elseLONG = new Label();
            Label endLONG = new Label();

            mv.visitLdcInsn((long)18395234);
            mv.visitVarInsn(Opcodes.LSTORE, 5);
            mv.visitLdcInsn((long)18395234);
            mv.visitVarInsn(Opcodes.LSTORE, 7);
            mv.visitVarInsn(Opcodes.LLOAD, 5);
            mv.visitInsn(Opcodes.L2I);
            mv.visitVarInsn(Opcodes.ISTORE, 9);
            mv.visitVarInsn(Opcodes.LLOAD, 7);
            mv.visitInsn(Opcodes.L2I);
            mv.visitVarInsn(Opcodes.ISTORE, 10);
            mv.visitVarInsn(Opcodes.ILOAD, 9);
            mv.visitVarInsn(Opcodes.ILOAD, 10);
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, elseifLONG);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.LLOAD, 5);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endLONG);
            mv.visitLabel(elseifLONG);
            mv.visitVarInsn(Opcodes.ILOAD, 9);
            mv.visitVarInsn(Opcodes.ILOAD, 10);
            mv.visitJumpInsn(Opcodes.IF_ICMPGE, elseLONG);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.LLOAD, 7);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V", false);
            mv.visitJumpInsn(Opcodes.GOTO, endLONG);
            mv.visitLabel(elseLONG);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitLdcInsn((String)"Both are Equal");
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            mv.visitLabel(endLONG);

            // final return statement
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(3,7);
            mv.visitEnd();
        }

        // writes class file and prints "Done" when compiled
        cw.visitEnd();
        byte b [] = cw.toByteArray();
        writeFile(b, "IF_THEN_ELSE.class");

        System.out.println("Done");
    } // end main
} // end class