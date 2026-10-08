package ot2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import iq0.TemporaryInterruption;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lot2/d;", "Lxw/f;", "Lot2/d$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lot2/d$a;)Lcb4/d;", "a", "Lmx/c;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ot2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lot2/d$a;", "", "Liq0/g0;", "temporaryInterruption", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Liq0/g0;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq0/g0;", "b", "()Liq0/g0;", "Ler/a;", "()Ler/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TemporaryInterruption temporaryInterruption;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        public Params(TemporaryInterruption temporaryInterruption, er.a<i0> aVar) {
            this.temporaryInterruption = temporaryInterruption;
            this.closeAction = aVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TemporaryInterruption getTemporaryInterruption() {
            return this.temporaryInterruption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.temporaryInterruption, params.temporaryInterruption) && t.c(this.closeAction, params.closeAction);
        }

        public int hashCode() {
            return (this.temporaryInterruption.hashCode() * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(temporaryInterruption=" + this.temporaryInterruption + ", closeAction=" + this.closeAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        h.b bVar = h.b.f24985a;
        String title = params.getTemporaryInterruption().getTitle();
        if (title == null) {
            title = "";
        }
        return new DialogData(bVar, mx.b.b(title, "temporaryInterruptionTitle"), mx.b.b(params.getTemporaryInterruption().getMessage(), "temporaryInterruptionMessage"), new DialogButtonTextData(this.labelProvider.c(rs2.a.f175890c), null, params.a(), 2, null), null, null, params.a(), 48, null);
    }
}
