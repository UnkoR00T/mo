package mh1;

import androidx.compose.ui.graphics.Color;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmh1/b;", "Lxw/f;", "Lmh1/b$a;", "Lmh1/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lmh1/b$a;)Lmh1/k$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: mh1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lmh1/b$a;", "", "Lmh1/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lk34/g;", "onDeleteDocumentClick", "<init>", "(Lmh1/j;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmh1/j;", "c", "()Lmh1/j;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<k34.g, i0> onDeleteDocumentClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, er.a<i0> aVar, er.l<? super k34.g, i0> lVar) {
            this.state = jVar;
            this.onBackAction = aVar;
            this.onDeleteDocumentClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.l<k34.g, i0> b() {
            return this.onDeleteDocumentClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onDeleteDocumentClick, params.onDeleteDocumentClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onDeleteDocumentClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onDeleteDocumentClick=" + this.onDeleteDocumentClick + ')';
        }
    }

    /* JADX INFO: renamed from: mh1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3110b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3110b f126530a = new C3110b();

        C3110b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(603321882);
            if (p076m2.t.k()) {
                p076m2.t.o(603321882, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsdeletion.DocumentsDeletionMapper.invoke.<anonymous>.<anonymous> (DocumentsDeletionMapper.kt:65)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, k34.g gVar) {
        params.b().b(gVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        Label labelC;
        j state = params.getState();
        if (state instanceof j.DocumentDeletionError) {
            return new k.a.Error(((j.DocumentDeletionError) state).getErrorVMS());
        }
        if (!(state instanceof j.Content) && !(state instanceof j.DocumentDeletionDialog)) {
            throw new oq.p();
        }
        j.DocumentDeletionDialog documentDeletionDialog = state instanceof j.DocumentDeletionDialog ? (j.DocumentDeletionDialog) state : null;
        cb4.i dialogVMS = documentDeletionDialog != null ? documentDeletionDialog.getDialogVMS() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(sg1.a.f181527w0), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        List<k34.g> listA = params.getState().a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        for (final k34.g gVar : listA) {
            mx.c cVar = this.labelProvider;
            Integer nameAlternative = gVar.getNameAlternative();
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(cVar.c(nameAlternative != null ? nameAlternative.intValue() : gVar.getName()), null, null, 0, 0, null, 62, null));
            Integer description = gVar.getDescription();
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, title, (description == null || (labelC = this.labelProvider.c(description.intValue())) == null) ? null : n50.l.b(labelC, null, null, 3, null), 1, null), null, new x0.IconButton(new ButtonIconData(null, jz.a.f106727a, C3110b.f126530a, null, this.labelProvider.c(sg1.a.f181532y), new er.a() { // from class: mh1.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, gVar);
                }
            }, 9, null)), null, 2815, null));
        }
        return new k.a.Screen(dialogVMS, baseScaffoldData, aVarA, arrayList);
    }
}
