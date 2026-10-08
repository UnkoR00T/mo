package n12;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import eo0.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln12/d;", "Lxw/f;", "Ln12/d$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ln12/d$a;)Lcb4/d;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n12.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln12/d$a;", "", "Leo0/t;", "directoryType", "Lkotlin/Function0;", "Loq/i0;", "deleteMessage", "<init>", "(Leo0/t;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/t;", "b", "()Leo0/t;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteMessage;

        public Params(t tVar, er.a<i0> aVar) {
            this.directoryType = tVar;
            this.deleteMessage = aVar;
        }

        public final er.a<i0> a() {
            return this.deleteMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final t getDirectoryType() {
            return this.directoryType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.directoryType == params.directoryType && fr.t.c(this.deleteMessage, params.deleteMessage);
        }

        public int hashCode() {
            return (this.directoryType.hashCode() * 31) + this.deleteMessage.hashCode();
        }

        public String toString() {
            return "Params(directoryType=" + this.directoryType + ", deleteMessage=" + this.deleteMessage + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130650a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.TRASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130650a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        int i15 = b.f130650a[params.getDirectoryType().ordinal()];
        if (i15 == 1) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.f46524e3), null, new DialogButtonTextData(this.labelProvider.c(e02.a.f46592q), cb4.a.C0668a.f24967a, params.a()), new DialogButtonTextData(this.labelProvider.c(e02.a.f46563l0), cb4.a.c.f24969a, new er.a() { // from class: n12.a
                @Override // er.a
                public final Object a() {
                    return d.i();
                }
            }), null, null, 100, null);
        }
        if (i15 != 2) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.f46626v3), this.labelProvider.c(e02.a.f46620u3), new DialogButtonTextData(this.labelProvider.c(e02.a.f46592q), cb4.a.C0668a.f24967a, params.a()), new DialogButtonTextData(this.labelProvider.c(e02.a.f46532g), cb4.a.c.f24969a, new er.a() { // from class: n12.c
                @Override // er.a
                public final Object a() {
                    return d.m();
                }
            }), null, null, 96, null);
        }
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.f46517d2), this.labelProvider.c(e02.a.f46511c2), new DialogButtonTextData(this.labelProvider.c(e02.a.f46592q), cb4.a.C0668a.f24967a, params.a()), new DialogButtonTextData(this.labelProvider.c(e02.a.f46532g), cb4.a.c.f24969a, new er.a() { // from class: n12.b
            @Override // er.a
            public final Object a() {
                return d.l();
            }
        }), null, null, 96, null);
    }
}
