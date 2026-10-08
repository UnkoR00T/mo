package w83;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import oo0.BEReportIssueReason;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import u83.ReasonListSetupData;
import u83.ReportIssueReasonItem;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lw83/c;", "Lxw/f;", "Lw83/c$a;", "Lu83/a;", "<init>", "()V", "params", "e", "(Lw83/c$a;)Lu83/a;", "a", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, ReasonListSetupData> {

    /* JADX INFO: renamed from: w83.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw83/c$a;", "", "Lkotlin/Function1;", "Loo0/b;", "Loq/i0;", "onCLick", "", "reasonList", "<init>", "(Ler/l;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "()Ler/l;", "b", "Ljava/util/List;", "()Ljava/util/List;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BEReportIssueReason, i0> onCLick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEReportIssueReason> reasonList;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(er.l<? super BEReportIssueReason, i0> lVar, List<BEReportIssueReason> list) {
            this.onCLick = lVar;
            this.reasonList = list;
        }

        public final er.l<BEReportIssueReason, i0> a() {
            return this.onCLick;
        }

        public final List<BEReportIssueReason> b() {
            return this.reasonList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onCLick, params.onCLick) && t.c(this.reasonList, params.reasonList);
        }

        public int hashCode() {
            return (this.onCLick.hashCode() * 31) + this.reasonList.hashCode();
        }

        public String toString() {
            return "Params(onCLick=" + this.onCLick + ", reasonList=" + this.reasonList + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, BEReportIssueReason bEReportIssueReason) {
        params.a().b(new BEReportIssueReason(bEReportIssueReason.getLabel(), bEReportIssueReason.getType()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ReasonListSetupData b(final Params params) {
        List<BEReportIssueReason> listB = params.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (final BEReportIssueReason bEReportIssueReason : listB) {
            arrayList.add(new ReportIssueReasonItem(bEReportIssueReason.getLabel(), bEReportIssueReason.getType(), new er.a() { // from class: w83.b
                @Override // er.a
                public final Object a() {
                    return c.f(params, bEReportIssueReason);
                }
            }));
        }
        return new ReasonListSetupData(arrayList);
    }
}
