package v54;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import r54.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv54/a;", "", "<init>", "()V", "", "status", "Lr54/e;", "b", "(Ljava/lang/String;)Lr54/e;", "a", "(Lr54/e;)Ljava/lang/String;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f204078a = new a();

    /* JADX INFO: renamed from: v54.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5320a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204079a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.DISPLAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f204079a = iArr;
        }
    }

    private a() {
    }

    public static final String a(e status) {
        if (status == null) {
            return null;
        }
        int i15 = C5320a.f204079a[status.ordinal()];
        if (i15 == 1) {
            return "SCHEDULED";
        }
        if (i15 == 2) {
            return "DISPLAYED";
        }
        if (i15 == 3) {
            return "BLOCKED";
        }
        throw new p();
    }

    public static final e b(String status) {
        e eVar = null;
        if (status == null) {
            return null;
        }
        for (e eVar2 : e.e()) {
            if (t.c(eVar2.name(), status)) {
                eVar = eVar2;
                break;
            }
        }
        return eVar;
    }
}
