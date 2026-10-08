package lc2;

import fr.t;
import hl0.IdCardInvalidationInitData;
import mc2.Section;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llc2/e;", "Lxw/f;", "Llc2/e$a;", "Lmc2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Llc2/e$a;)Lmc2/a;", "a", "Lmx/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lc2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Llc2/e$a;", "", "Lhl0/b$b;", "data", "", "isIdentityTheft", "<init>", "(Lhl0/b$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b$b;", "()Lhl0/b$b;", "b", "Z", "()Z", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationInitData.OfficeData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIdentityTheft;

        public Params(IdCardInvalidationInitData.OfficeData officeData, boolean z15) {
            this.data = officeData;
            this.isIdentityTheft = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdCardInvalidationInitData.OfficeData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsIdentityTheft() {
            return this.isIdentityTheft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && this.isIdentityTheft == params.isIdentityTheft;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + Boolean.hashCode(this.isIdentityTheft);
        }

        public String toString() {
            return "Params(data=" + this.data + ", isIdentityTheft=" + this.isIdentityTheft + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        int i15;
        IdCardInvalidationInitData.OfficeData data = params.getData();
        mx.c cVar = this.labelProvider;
        boolean isIdentityTheft = params.getIsIdentityTheft();
        if (isIdentityTheft) {
            i15 = hb2.b.f82804p0;
        } else {
            if (isIdentityTheft) {
                throw new p();
            }
            i15 = hb2.b.f82774a0;
        }
        return new Section(cVar.c(i15), new CardListData(v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(data.getDescriptiveOrganizationName(), "descriptiveOrganizationName"), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }
}
