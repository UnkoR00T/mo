package r92;

import fr.t;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p92.y;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr92/b;", "Lxw/f;", "Lr92/b$a;", "Lp92/y$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "title", "Ln50/a;", "c", "(I)Ln50/a;", "params", "e", "(Lr92/b$a;)Lp92/y$a;", "a", "Lmx/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, y.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: r92.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lr92/b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "unsafeClickAction", "municipalClickAction", "otherClickAction", "<init>", "(Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> unsafeClickAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> municipalClickAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> otherClickAction;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.unsafeClickAction = aVar;
            this.municipalClickAction = aVar2;
            this.otherClickAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.municipalClickAction;
        }

        public final er.a<i0> b() {
            return this.otherClickAction;
        }

        public final er.a<i0> c() {
            return this.unsafeClickAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.unsafeClickAction, params.unsafeClickAction) && t.c(this.municipalClickAction, params.municipalClickAction) && t.c(this.otherClickAction, params.otherClickAction);
        }

        public int hashCode() {
            return (((this.unsafeClickAction.hashCode() * 31) + this.municipalClickAction.hashCode()) * 31) + this.otherClickAction.hashCode();
        }

        public String toString() {
            return "Params(unsafeClickAction=" + this.unsafeClickAction + ", municipalClickAction=" + this.municipalClickAction + ", otherClickAction=" + this.otherClickAction + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final BodySection c(int title) {
        return new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(title), null, null, 0, 0, null, 62, null)), null, 5, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public y.Data b(Params params) {
        Label labelC = this.labelProvider.c(v72.b.C1);
        BodySection bodySectionC = c(v72.b.B1);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new y.Data(labelC, v.q(new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, bodySectionC, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, c(v72.b.D1), null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, c(v72.b.E1), null, companion.b(), null, 2813, null)));
    }
}
