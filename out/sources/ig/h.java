package ig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i f92198a;

    protected h(i iVar) {
        this.f92198a = iVar;
    }

    public static i c(Activity activity) {
        return d(new g(activity));
    }

    protected static i d(g gVar) {
        if (gVar.a()) {
            return r1.R1(gVar.d());
        }
        if (gVar.b()) {
            return o1.a(gVar.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityG = this.f92198a.g();
        jg.s.l(activityG);
        return activityG;
    }

    public void e(int i15, int i16, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
