package ue2;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.i;
import n50.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import te2.c;
import x50.NavigationButtonData;
import xw.f;
import zd2.ThumbnailsWihName;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lue2/b;", "Lxw/f;", "Lue2/b$a;", "Lte2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "params", "e", "(Lue2/b$a;)Lte2/c$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ue2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006 "}, d2 = {"Lue2/b$a;", "", "Lte2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function2;", "Lmx/a;", "Lo04/c;", "onClickImage", "<init>", "(Lte2/b;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lte2/b;", "c", "()Lte2/b;", "b", "Ler/a;", "()Ler/a;", "Ler/p;", "()Ler/p;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final te2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Label, o04.c, i0> onClickImage;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(te2.b bVar, er.a<i0> aVar, p<? super Label, ? super o04.c, i0> pVar) {
            this.state = bVar;
            this.onClose = aVar;
            this.onClickImage = pVar;
        }

        public final p<Label, o04.c, i0> a() {
            return this.onClickImage;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final te2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onClickImage, params.onClickImage);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onClickImage.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onClickImage=" + this.onClickImage + ')';
        }
    }

    /* JADX INFO: renamed from: ue2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5146b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5146b f198045a = new C5146b();

        C5146b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-786814549);
            if (p076m2.t.k()) {
                p076m2.t.o(-786814549, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.photoslist.mapper.PhotosListScreenMapper.invoke.<anonymous>.<anonymous> (PhotosListScreenMapper.kt:61)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, Label label, ThumbnailsWihName thumbnailsWihName) {
        params.a().B(label, thumbnailsWihName.getThumbnail());
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        i image;
        te2.b state = params.getState();
        if (t.c(state, te2.b.a.f189921a)) {
            return new c.a.Empty(params.b());
        }
        if (!(state instanceof te2.b.Initialized)) {
            throw new oq.p();
        }
        er.a<i0> aVarB = params.b();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), h(ud2.a.B), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelH = h(ud2.a.f197742j0);
        List<ThumbnailsWihName> listA = ((te2.b.Initialized) state).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final ThumbnailsWihName thumbnailsWihName = (ThumbnailsWihName) obj;
            final Label labelB = mx.b.b(h(ud2.a.A).getText() + ' ' + i16, "");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("thumbnail_");
            sb5.append(i15);
            String string = sb5.toString();
            boolean z15 = thumbnailsWihName.getBitmap() == null;
            if (z15) {
                image = new i.RoundedSquareIcon(jz.a.M0, null, null, null, C5146b.f198045a, null, null, null, 238, null);
            } else {
                if (z15) {
                    throw new oq.p();
                }
                image = new i.Image(thumbnailsWihName.getBitmap(), null, new er.a() { // from class: ue2.a
                    @Override // er.a
                    public final Object a() {
                        return b.f(params, labelB, thumbnailsWihName);
                    }
                }, 2, null);
            }
            arrayList.add(new DefaultSingleCardData(string, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(labelB, null, null, 3, null)), null, 5, null), new LeadingSection(false, null, image, 3, null), null, null, 3326, null));
            i15 = i16;
        }
        return new c.a.Initialized(aVarB, baseScaffoldData, labelH, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
