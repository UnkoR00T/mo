package w64;

import fr.k;
import iy.a0;
import mu.b0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0018\u0010\u0014\u001a\u00020\u000b*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw64/a;", "Lwy/a;", "<init>", "()V", "Liy/a0;", "key", "Loq/i0;", "b", "(Liy/a0;)V", "c", "()Liy/a0;", "", "a", "()Z", "clear", "Lmu/b0;", "Lmu/b0;", "masterKey", "d", "(Liy/a0;)Z", "isAssigned", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements wy.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C5536a f210601b = new C5536a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a0 f210602c = a0.INSTANCE.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<a0> masterKey = r0.a(f210602c);

    /* JADX INFO: renamed from: w64.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw64/a$a;", "", "<init>", "()V", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C5536a {
        public /* synthetic */ C5536a(k kVar) {
            this();
        }

        private C5536a() {
        }
    }

    private final boolean d(a0 a0Var) {
        return !a0Var.b(f210602c);
    }

    @Override // wy.a
    public boolean a() {
        return d(this.masterKey.getValue());
    }

    @Override // wy.a
    public void b(a0 key) {
        b0<a0> b0Var = this.masterKey;
        while (!b0Var.s(b0Var.getValue(), key)) {
        }
    }

    @Override // wy.a
    public a0 c() {
        return new a0((byte[]) this.masterKey.getValue().getData().clone());
    }

    @Override // wy.a
    public void clear() {
        b0<a0> b0Var = this.masterKey;
        while (!b0Var.s(b0Var.getValue(), f210602c)) {
        }
    }
}
