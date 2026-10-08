package be;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f18799g = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Throwable> f18800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zd.f f18801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zd.a f18802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f18803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f18805f;

    public q(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    private void a(Throwable th4, List<Throwable> list) {
        if (!(th4 instanceof q)) {
            list.add(th4);
            return;
        }
        Iterator<Throwable> it = ((q) th4).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e15) {
            throw new RuntimeException(e15);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i15 = 0;
        while (i15 < size) {
            int i16 = i15 + 1;
            appendable.append("Cause (").append(String.valueOf(i16)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th4 = list.get(i15);
            if (th4 instanceof q) {
                ((q) th4).h(appendable);
            } else {
                d(th4, appendable);
            }
            i15 = i16;
        }
    }

    private static void d(Throwable th4, Appendable appendable) {
        try {
            appendable.append(th4.getClass().toString()).append(": ").append(th4.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th4);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f18800a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> listF = f();
        int size = listF.size();
        int i15 = 0;
        while (i15 < size) {
            int i16 = i15 + 1;
            listF.get(i15);
            i15 = i16;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb5 = new StringBuilder(71);
        sb5.append(this.f18804e);
        sb5.append(this.f18803d != null ? ", " + this.f18803d : "");
        sb5.append(this.f18802c != null ? ", " + this.f18802c : "");
        sb5.append(this.f18801b != null ? ", " + this.f18801b : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb5.toString();
        }
        if (listF.size() == 1) {
            sb5.append("\nThere was 1 root cause:");
        } else {
            sb5.append("\nThere were ");
            sb5.append(listF.size());
            sb5.append(" root causes:");
        }
        for (Throwable th4 : listF) {
            sb5.append('\n');
            sb5.append(th4.getClass().getName());
            sb5.append('(');
            sb5.append(th4.getMessage());
            sb5.append(')');
        }
        sb5.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb5.toString();
    }

    void i(zd.f fVar, zd.a aVar) {
        j(fVar, aVar, null);
    }

    void j(zd.f fVar, zd.a aVar, Class<?> cls) {
        this.f18801b = fVar;
        this.f18802c = aVar;
        this.f18803d = cls;
    }

    public void k(Exception exc) {
        this.f18805f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th4) {
        this(str, (List<Throwable>) Collections.singletonList(th4));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f18804e = str;
        setStackTrace(f18799g);
        this.f18800a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f18806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18807b = true;

        a(Appendable appendable) {
            this.f18806a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c15) throws IOException {
            if (this.f18807b) {
                this.f18807b = false;
                this.f18806a.append("  ");
            }
            this.f18807b = c15 == '\n';
            this.f18806a.append(c15);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i15, int i16) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z15 = false;
            if (this.f18807b) {
                this.f18807b = false;
                this.f18806a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i16 - 1) == '\n') {
                z15 = true;
            }
            this.f18807b = z15;
            this.f18806a.append(charSequenceA, i15, i16);
            return this;
        }
    }
}
