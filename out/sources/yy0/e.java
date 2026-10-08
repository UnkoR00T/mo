package yy0;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyy0/e;", "Lxw/f;", "Lyy0/e$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lyy0/e$a;)Lcb4/d;", "a", "Lmx/c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yy0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyy0/e$a;", "", "Lzy0/b;", "dialogType", "Lkotlin/Function0;", "Loq/i0;", "goToPermissionsSettings", "<init>", "(Lzy0/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzy0/b;", "()Lzy0/b;", "b", "Ler/a;", "()Ler/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zy0.b dialogType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionsSettings;

        public Params(zy0.b bVar, er.a<i0> aVar) {
            this.dialogType = bVar;
            this.goToPermissionsSettings = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zy0.b getDialogType() {
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
        public static final /* synthetic */ int[] f230643a;

        static {
            int[] iArr = new int[zy0.b.values().length];
            try {
                iArr[zy0.b.GPS_PERMISSION_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zy0.b.GPS_DISABLED_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f230643a = iArr;
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
    public DialogData b(Params params) {
        int i15 = b.f230643a[params.getDialogType().ordinal()];
        if (i15 == 1) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(zx0.b.f238249e0), this.labelProvider.c(zx0.b.f238247d0), new DialogButtonTextData(this.labelProvider.c(zx0.b.f238245c0), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(zx0.b.f238243b0), null, new er.a() { // from class: yy0.a
                @Override // er.a
                public final Object a() {
                    return e.l();
                }
            }, 2, null), null, new er.a() { // from class: yy0.b
                @Override // er.a
                public final Object a() {
                    return e.m();
                }
            }, 32, null);
        }
        if (i15 == 2) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(zx0.b.f238253g0), this.labelProvider.c(zx0.b.f238251f0), new DialogButtonTextData(this.labelProvider.c(zx0.b.f238245c0), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(zx0.b.f238243b0), null, new er.a() { // from class: yy0.c
                @Override // er.a
                public final Object a() {
                    return e.q();
                }
            }, 2, null), null, new er.a() { // from class: yy0.d
                @Override // er.a
                public final Object a() {
                    return e.r();
                }
            }, 32, null);
        }
        throw new p();
    }
}
