package t72;

import fr.t;
import j30.ButtonTextData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt72/e;", "Lxw/f;", "Lt72/e$a;", "Lvw/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lt72/e$a;)Lvw/a;", "a", "Lmx/c;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, NavigationDialogModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: t72.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lt72/e$a;", "", "Lu72/a;", "dialogType", "Lkotlin/Function0;", "Loq/i0;", "goToPermissionsSettings", "<init>", "(Lu72/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu72/a;", "()Lu72/a;", "b", "Ler/a;", "()Ler/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u72.a dialogType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionsSettings;

        public Params(u72.a aVar, er.a<i0> aVar2) {
            this.dialogType = aVar;
            this.goToPermissionsSettings = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final u72.a getDialogType() {
            return this.dialogType;
        }

        public final er.a<i0> b() {
            return this.goToPermissionsSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.dialogType == params.dialogType && t.c(this.goToPermissionsSettings, params.goToPermissionsSettings);
        }

        public int hashCode() {
            return (this.dialogType.hashCode() * 31) + this.goToPermissionsSettings.hashCode();
        }

        public String toString() {
            return "Params(dialogType=" + this.dialogType + ", goToPermissionsSettings=" + this.goToPermissionsSettings + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188772a;

        static {
            int[] iArr = new int[u72.a.values().length];
            try {
                iArr[u72.a.GPS_PERMISSION_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u72.a.GPS_DISABLED_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f188772a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public NavigationDialogModel b(Params params) {
        int i15 = b.f188772a[params.getDialogType().ordinal()];
        if (i15 == 1) {
            return new NavigationDialogModel(this.labelProvider.c(a72.c.f4054q0), this.labelProvider.c(a72.c.f4052p0), null, null, null, new er.a() { // from class: t72.a
                @Override // er.a
                public final Object a() {
                    return e.l();
                }
            }, new ButtonTextData(null, this.labelProvider.c(a72.c.f4050o0), null, null, params.b(), 13, null), new ButtonTextData(null, this.labelProvider.c(a72.c.f4048n0), null, null, new er.a() { // from class: t72.b
                @Override // er.a
                public final Object a() {
                    return e.m();
                }
            }, 13, null), 28, null);
        }
        if (i15 == 2) {
            return new NavigationDialogModel(this.labelProvider.c(a72.c.f4058s0), this.labelProvider.c(a72.c.f4056r0), null, null, null, new er.a() { // from class: t72.c
                @Override // er.a
                public final Object a() {
                    return e.q();
                }
            }, new ButtonTextData(null, this.labelProvider.c(a72.c.f4050o0), null, null, params.b(), 13, null), new ButtonTextData(null, this.labelProvider.c(a72.c.f4048n0), null, null, new er.a() { // from class: t72.d
                @Override // er.a
                public final Object a() {
                    return e.r();
                }
            }, 13, null), 28, null);
        }
        throw new p();
    }
}
