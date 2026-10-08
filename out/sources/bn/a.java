package bn;

import an.c;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import jg.r;
import zm.d;

/* JADX INFO: loaded from: classes4.dex */
public class a implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20319d = new C0531a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f20321b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f20320a = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20322c = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* JADX INFO: renamed from: bn.a$a, reason: collision with other inner class name */
    public static class C0531a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f20323a;

        public a a() {
            return new a(this.f20323a, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }
    }

    public a(Executor executor, String str) {
        this.f20321b = executor;
    }

    @Override // zm.d
    public final String a() {
        return true != c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // zm.d
    public final String b() {
        return this.f20322c;
    }

    @Override // zm.d
    public final boolean c() {
        return c.a(this.f20320a, ModuleDescriptor.MODULE_ID);
    }

    @Override // zm.d
    public final int d() {
        return c() ? 24317 : 24306;
    }

    @Override // zm.d
    public final String e() {
        return true != c() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return r.a(this.f20321b, ((a) obj).f20321b);
        }
        return false;
    }

    @Override // zm.d
    public final String f() {
        return "en";
    }

    @Override // zm.d
    public final Executor g() {
        return this.f20321b;
    }

    @Override // zm.d
    public final int h() {
        return 1;
    }

    public int hashCode() {
        return r.b(this.f20321b);
    }

    @Override // zm.d
    public final String i() {
        return "optional-module-text-latin";
    }
}
