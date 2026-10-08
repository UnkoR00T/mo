package s7;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class b<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f178563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a<D> f178564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f178565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f178566d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f178567e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f178568f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f178569g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f178570h = false;

    public interface a<D> {
        void a(b<D> bVar, D d15);
    }

    public b(Context context) {
        this.f178565c = context.getApplicationContext();
    }

    public void a() {
        this.f178567e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f178570h = false;
    }

    public String d(D d15) {
        StringBuilder sb5 = new StringBuilder(64);
        i6.b.a(d15, sb5);
        sb5.append("}");
        return sb5.toString();
    }

    public void e() {
    }

    public void f(D d15) {
        a<D> aVar = this.f178564b;
        if (aVar != null) {
            aVar.a(this, d15);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f178563a);
        printWriter.print(" mListener=");
        printWriter.println(this.f178564b);
        if (this.f178566d || this.f178569g || this.f178570h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f178566d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f178569g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f178570h);
        }
        if (this.f178567e || this.f178568f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f178567e);
            printWriter.print(" mReset=");
            printWriter.println(this.f178568f);
        }
    }

    public void h() {
        n();
    }

    public Context i() {
        return this.f178565c;
    }

    public boolean j() {
        return this.f178567e;
    }

    protected void k() {
    }

    protected boolean l() {
        throw null;
    }

    public void m() {
        if (this.f178566d) {
            h();
        } else {
            this.f178569g = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void p() {
        throw null;
    }

    protected void q() {
        throw null;
    }

    public void r(int i15, a<D> aVar) {
        if (this.f178564b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f178564b = aVar;
        this.f178563a = i15;
    }

    public void s() {
        o();
        this.f178568f = true;
        this.f178566d = false;
        this.f178567e = false;
        this.f178569g = false;
        this.f178570h = false;
    }

    public void t() {
        if (this.f178570h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(64);
        i6.b.a(this, sb5);
        sb5.append(" id=");
        sb5.append(this.f178563a);
        sb5.append("}");
        return sb5.toString();
    }

    public final void u() {
        this.f178566d = true;
        this.f178568f = false;
        this.f178567e = false;
        p();
    }

    public void v() {
        this.f178566d = false;
        q();
    }

    public void w(a<D> aVar) {
        a<D> aVar2 = this.f178564b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f178564b = null;
    }
}
