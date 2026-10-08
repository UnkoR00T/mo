package lc2;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import mc2.Section;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import wx.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Llc2/g;", "Lxw/f;", "Llc2/g$a;", "Lmc2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Llc2/g$a;)Lmc2/a;", "a", "Lmx/c;", "Lwx/i;", "Lmx/a;", "c", "(Lwx/i;)Lmx/a;", "sizeInReadableFormat", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lc2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llc2/g$a;", "", "", "Lwx/i;", "data", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i> data;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(List<? extends i> list) {
            this.data = list;
        }

        public final List<i> a() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f117789a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1853561091);
            if (p076m2.t.k()) {
                p076m2.t.o(1853561091, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.summary.mapper.TheftDescriptionAttachmentsMapper.invoke.<anonymous>.<anonymous> (TheftDescriptionAttachmentsMapper.kt:41)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f117790a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(244730561);
            if (p076m2.t.k()) {
                p076m2.t.o(244730561, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.summary.mapper.TheftDescriptionAttachmentsMapper.invoke.<anonymous>.<anonymous> (TheftDescriptionAttachmentsMapper.kt:40)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(i iVar) {
        return this.labelProvider.e(hb2.b.f82815v, t04.a.c(iVar.d()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        Label labelC = this.labelProvider.c(hb2.b.f82773a);
        List<i> listA = params.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            i iVar = (i) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), "fileTitle_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(c(iVar), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.RoundedSquareIcon(jz.a.M0, null, b.f117789a, d40.i.g.f39710e, c.f117790a, d40.i.C0865i.f39712e, null, null, 194, null), 3, null), null, null, 3327, null));
            i15 = i16;
        }
        return new Section(labelC, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
