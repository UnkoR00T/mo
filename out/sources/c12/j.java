package c12;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import eo0.b1;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc12/j;", "Lxw/f;", "Lc12/j$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lc12/j$a;)Lcb4/d;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c12.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc12/j$a;", "", "Leo0/b1;", "warningType", "Lkotlin/Function0;", "Loq/i0;", "addRecipientClick", "<init>", "(Leo0/b1;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/b1;", "b", "()Leo0/b1;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b1 warningType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addRecipientClick;

        public Params(b1 b1Var, er.a<i0> aVar) {
            this.warningType = b1Var;
            this.addRecipientClick = aVar;
        }

        public final er.a<i0> a() {
            return this.addRecipientClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b1 getWarningType() {
            return this.warningType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.warningType, params.warningType) && t.c(this.addRecipientClick, params.addRecipientClick);
        }

        public int hashCode() {
            return (this.warningType.hashCode() * 31) + this.addRecipientClick.hashCode();
        }

        public String toString() {
            return "Params(warningType=" + this.warningType + ", addRecipientClick=" + this.addRecipientClick + ')';
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        b1 warningType = params.getWarningType();
        if (warningType instanceof b1.Blocking) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.R), mx.b.b(((b1.Blocking) params.getWarningType()).getMessage(), "dialogMessage"), new DialogButtonTextData(this.labelProvider.c(e02.a.f46550j), null, new er.a() { // from class: c12.h
                @Override // er.a
                public final Object a() {
                    return j.h();
                }
            }, 2, null), null, null, null, 112, null);
        }
        if (warningType instanceof b1.NotBlocking) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.R), mx.b.b(((b1.NotBlocking) params.getWarningType()).getMessage(), "dialogMessage"), new DialogButtonTextData(this.labelProvider.c(e02.a.f46522e1), null, params.a(), 2, null), new DialogButtonTextData(this.labelProvider.c(e02.a.f46532g), null, new er.a() { // from class: c12.i
                @Override // er.a
                public final Object a() {
                    return j.i();
                }
            }, 2, null), null, null, 96, null);
        }
        throw new p();
    }
}
