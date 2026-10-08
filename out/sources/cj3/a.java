package cj3;

import fr.k;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcj3/a;", "Lgz/b;", "Lcj3/a$a;", "", "<init>", "()V", "params", "d", "(Lcj3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<C0713a, Boolean> {

    /* JADX INFO: renamed from: cj3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcj3/a$a;", "Lgz/b$a;", "Luv0/v;", "vinNumber", "", "wasVinVerified", "<init>", "(Liy/b0;ZLfr/k;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Z", "()Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0713a implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27460c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 vinNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean wasVinVerified;

        public /* synthetic */ C0713a(b0 b0Var, boolean z15, k kVar) {
            this(b0Var, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getVinNumber() {
            return this.vinNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWasVinVerified() {
            return this.wasVinVerified;
        }

        private C0713a(b0 b0Var, boolean z15) {
            this.vinNumber = b0Var;
            this.wasVinVerified = z15;
        }
    }

    public Object d(C0713a c0713a, e<? super Boolean> eVar) {
        String strE = c0.e(c0713a.getVinNumber());
        boolean z15 = false;
        if (!b.f27463a.matcher(strE).find() && strE.length() <= 25 && (strE.length() >= 1 || !c0713a.getWasVinVerified())) {
            z15 = true;
        }
        return vq.b.a(z15);
    }
}
