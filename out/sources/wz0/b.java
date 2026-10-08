package wz0;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import iq0.ApplicationFormServiceGroup;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import vz0.h;
import vz0.i;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwz0/b;", "Lxw/f;", "Lwz0/b$a;", "Lvz0/i$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrz/a;Liy/a;)V", "params", "e", "(Lwz0/b$a;)Lvz0/i$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: wz0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lwz0/b$a;", "", "Lvz0/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Liq0/j;", "onGroupSelected", "<init>", "(Lvz0/h;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvz0/h;", "c", "()Lvz0/h;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ApplicationFormServiceGroup, i0> onGroupSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, er.a<i0> aVar, l<? super ApplicationFormServiceGroup, i0> lVar) {
            this.state = hVar;
            this.onBack = aVar;
            this.onGroupSelected = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<ApplicationFormServiceGroup, i0> b() {
            return this.onGroupSelected;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onGroupSelected, params.onGroupSelected);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onGroupSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onGroupSelected=" + this.onGroupSelected + ')';
        }
    }

    /* JADX INFO: renamed from: wz0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5738b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5738b f216013a = new C5738b();

        C5738b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1991608824);
            if (p076m2.t.k()) {
                p076m2.t.o(-1991608824, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.mappers.ApplicationCategoriesScreenMapper.invoke.<anonymous> (ApplicationCategoriesScreenMapper.kt:56)");
            }
            long jA = ((xz0.a) rVar.N(xz0.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(c cVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ApplicationFormServiceGroup applicationFormServiceGroup) {
        params.b().b(applicationFormServiceGroup);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        Object objB;
        Label labelB;
        h state = params.getState();
        if (t.c(state, h.b.f208741a)) {
            return i.a.b.f208746a;
        }
        if (!(state instanceof h.DataLoaded)) {
            if (t.c(state, h.c.f208742a)) {
                return new i.a.NoData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(sz0.a.f186121f), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106814l2), this.labelProvider.c(sz0.a.f186117b), this.labelProvider.c(sz0.a.f186116a), null, null, null, false, 72, null));
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(sz0.a.f186121f), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.S3, null, C5738b.f216013a, this.labelProvider.c(sz0.a.f186120e), this.labelProvider.c(sz0.a.f186119d), null, 34, null);
        List<ApplicationFormServiceGroup> listA = ((h.DataLoaded) params.getState()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final ApplicationFormServiceGroup applicationFormServiceGroup = (ApplicationFormServiceGroup) obj;
            rz.a aVar = this.bitmapDecoder;
            SingleCardLabel singleCardLabelB = null;
            dx.i iVarC = iy.a.c(this.base64Coder, applicationFormServiceGroup.getIcon(), null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarC).b();
            }
            String str = "GroupName_" + i15;
            LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.BitmapResource(aVar.a((byte[]) objB), d40.i.f.f39709e), null, null, 6, null), 3, null);
            n50.b.Title title = new n50.b.Title(n50.l.b(mx.b.b(applicationFormServiceGroup.getName(), ""), null, null, 3, null));
            String description = applicationFormServiceGroup.getDescription();
            if (description != null && (labelB = mx.b.b(description, "")) != null) {
                singleCardLabelB = n50.l.b(labelB, null, null, 3, null);
            }
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: wz0.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, applicationFormServiceGroup);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, singleCardLabelB, 1, null), leadingSection, x0.Icon.INSTANCE.b(), null, 2300, null));
            i15 = i16;
        }
        return new i.a.DataLoaded(baseScaffoldData, icon, arrayList);
    }
}
