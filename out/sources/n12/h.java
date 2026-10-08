package n12;

import fr.t;
import h30.ButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Ln12/h;", "Lxw/f;", "Ln12/h$a;", "", "Lh30/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkotlin/Function0;", "Loq/i0;", "action", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lk30/d;", "buttonVariant", "Lk30/b;", "buttonState", "h", "(Ler/a;Lmx/a;Lk30/d;Lk30/b;)Lh30/a;", "params", "q", "(Ln12/h$a;)Ljava/util/List;", "a", "Loq/k;", "l", "()Lmx/a;", "forwardLabel", "b", "m", "replyLabel", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, List<? extends ButtonData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k forwardLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k replyLabel;

    /* JADX INFO: renamed from: n12.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln12/h$a;", "", "Lkotlin/Function0;", "Loq/i0;", "forwardAction", "replyAction", "Lfo0/c;", "messageDetails", "<init>", "(Ler/a;Ler/a;Lfo0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "c", "Lfo0/c;", "()Lfo0/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> forwardAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> replyAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final fo0.c messageDetails;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, fo0.c cVar) {
            this.forwardAction = aVar;
            this.replyAction = aVar2;
            this.messageDetails = cVar;
        }

        public final er.a<i0> a() {
            return this.forwardAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fo0.c getMessageDetails() {
            return this.messageDetails;
        }

        public final er.a<i0> c() {
            return this.replyAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.forwardAction, params.forwardAction) && t.c(this.replyAction, params.replyAction) && t.c(this.messageDetails, params.messageDetails);
        }

        public int hashCode() {
            return (((this.forwardAction.hashCode() * 31) + this.replyAction.hashCode()) * 31) + this.messageDetails.hashCode();
        }

        public String toString() {
            return "Params(forwardAction=" + this.forwardAction + ", replyAction=" + this.replyAction + ", messageDetails=" + this.messageDetails + ')';
        }
    }

    public h(final mx.c cVar) {
        this.forwardLabel = oq.l.a(new er.a() { // from class: n12.f
            @Override // er.a
            public final Object a() {
                return h.f(cVar);
            }
        });
        this.replyLabel = oq.l.a(new er.a() { // from class: n12.g
            @Override // er.a
            public final Object a() {
                return h.r(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Label f(mx.c cVar) {
        return cVar.c(e02.a.N2);
    }

    private final ButtonData h(er.a<i0> action, Label label, k30.d buttonVariant, k30.b buttonState) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(label, null, 2, null), buttonVariant, buttonState, action, 3, null);
    }

    static /* synthetic */ ButtonData i(h hVar, er.a aVar, Label label, k30.d dVar, k30.b bVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            bVar = k30.b.c.f107768a;
        }
        return hVar.h(aVar, label, dVar, bVar);
    }

    private final Label l() {
        return (Label) this.forwardLabel.getValue();
    }

    private final Label m() {
        return (Label) this.replyLabel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Label r(mx.c cVar) {
        return cVar.c(e02.a.O2);
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<ButtonData> b(Params params) {
        if (params.getMessageDetails().getType() == fo0.g.STUB) {
            return v.n();
        }
        if (params.getMessageDetails().getType() == fo0.g.EVIDENCE) {
            return v.e(i(this, params.a(), l(), k30.d.a.f107773a, null, 8, null));
        }
        if (params.getMessageDetails().t()) {
            return v.q(i(this, params.c(), m(), k30.d.a.f107773a, null, 8, null), i(this, params.a(), l(), new k30.d.Secondary(null, 1, null), null, 8, null));
        }
        if (!params.getMessageDetails().u()) {
            return v.n();
        }
        return v.e(i(this, params.a(), l(), k30.d.a.f107773a, null, 8, null));
    }
}
