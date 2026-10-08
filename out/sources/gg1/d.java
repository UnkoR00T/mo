package gg1;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import ma1.CompanyCategory;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgg1/d;", "Lxw/f;", "Lgg1/d$a;", "Lfg1/n$a$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgg1/d$a;)Lfg1/n$a$b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, fg1.n.a.Pkd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgg1/d$a;", "", "", "Lma1/c;", "pkdCodes", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Ljava/util/List;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CompanyCategory> pkdCodes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(List<CompanyCategory> list, er.a<i0> aVar) {
            this.pkdCodes = list;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final List<CompanyCategory> b() {
            return this.pkdCodes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.pkdCodes, params.pkdCodes) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            List<CompanyCategory> list = this.pkdCodes;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(pkdCodes=" + this.pkdCodes + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fg1.n.a.Pkd b(Params params) {
        List listN;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(null, this.labelProvider.c(ha1.a.Y1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.a(), 6, null)), null, 21, null), null, null, null, null, 61, null);
        List<CompanyCategory> listB = params.b();
        if (listB != null) {
            List<CompanyCategory> list = listB;
            listN = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                CompanyCategory companyCategory = (CompanyCategory) obj;
                listN.add(m.b(mx.b.b(companyCategory.getCode(), "pkdCodeNo" + i15), null, mx.b.b(companyCategory.getName(), "pkdCodeNameNo" + i15), null, j70.a.LETTER_BY_LETTER, 10, null));
                i15 = i16;
            }
        } else {
            listN = v.n();
        }
        return new fg1.n.a.Pkd(baseScaffoldData, new fg1.n.a.SummarySectionData(null, new CardListData(listN, null, false, null, null, 30, null)), params.a());
    }
}
