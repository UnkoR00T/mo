package com.google.android.gms.internal.vision;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f30982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f30983b;

    static final class a extends c {
        a() {
        }

        @Override // com.google.android.gms.internal.vision.c
        public final void a(Throwable th4) {
            th4.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0016 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    static {
        Integer numA;
        c aVar;
        try {
            numA = a();
            if (numA != null) {
                try {
                    if (numA.intValue() >= 19) {
                        aVar = new w();
                    } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                        aVar = new a();
                    } else {
                        aVar = new g();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    PrintStream printStream = System.err;
                    String name = a.class.getName();
                    StringBuilder sb5 = new StringBuilder(name.length() + 133);
                    sb5.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb5.append(name);
                    sb5.append("will be used. The error is: ");
                    printStream.println(sb5.toString());
                    th.printStackTrace(System.err);
                    aVar = new a();
                }
            } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                aVar = new g();
            } else {
                aVar = new a();
            }
        } catch (Throwable th5) {
            th = th5;
            numA = null;
        }
        f30982a = aVar;
        f30983b = numA == null ? 1 : numA.intValue();
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e15) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e15.printStackTrace(System.err);
            return null;
        }
    }

    public static void b(Throwable th4) {
        f30982a.a(th4);
    }
}
