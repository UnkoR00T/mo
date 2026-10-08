package c83;

import a83.d;
import b30.AccordionData;
import b30.AccordionElement;
import b83.b;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.c;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc83/a;", "Lxw/f;", "Lc83/a$a;", "La83/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lc83/a$a;)La83/d$a;", "a", "Lmx/c;", "", "Loq/r;", "", "b", "Ljava/util/List;", "questionAnswerPairs", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<r<Integer, Integer>> questionAnswerPairs = v.q(y.a(Integer.valueOf(n73.a.I), Integer.valueOf(n73.a.C)), y.a(Integer.valueOf(n73.a.J), Integer.valueOf(n73.a.D)), y.a(Integer.valueOf(n73.a.K), Integer.valueOf(n73.a.E)), y.a(Integer.valueOf(n73.a.L), Integer.valueOf(n73.a.F)), y.a(Integer.valueOf(n73.a.M), Integer.valueOf(n73.a.G)), y.a(Integer.valueOf(n73.a.N), Integer.valueOf(n73.a.H)));

    /* JADX INFO: renamed from: c83.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lc83/a$a;", "", "La83/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(La83/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La83/c;", "getState", "()La83/c;", "b", "Ler/a;", "()Ler/a;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a83.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(a83.c cVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(n73.a.f133452d), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        List<r<Integer, Integer>> list = this.questionAnswerPairs;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            arrayList.add(new AccordionElement(null, this.labelProvider.c(((Number) rVar.a()).intValue()), null, false, null, false, new b(this.labelProvider.c(((Number) rVar.b()).intValue())), 61, null));
        }
        return new d.Data(baseScaffoldData, aVarA, new AccordionData(arrayList));
    }
}
