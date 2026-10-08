package ci3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lci3/i;", "Lxw/f;", "Lci3/i$a;", "Lai3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lmx/a;", "l", "(F)Lmx/a;", "params", "f", "(Lci3/i$a;)Lai3/c$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, ai3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ci3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010*R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b&\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b+\u0010$¨\u0006."}, d2 = {"Lci3/i$a;", "", "Lai3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAddFileClicked", "addPhoto", "takePhoto", "Lkotlin/Function1;", "Lo04/c;", "onDelete", "onImageClicked", "Lg30/v;", "onBottomSheetStateChanged", "onGoToNextStep", "onBackAction", "onExitAction", "<init>", "(Lai3/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lai3/b;", "i", "()Lai3/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "j", "e", "Ler/l;", "()Ler/l;", "f", "h", "g", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ai3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddFileClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addPhoto;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> takePhoto;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<o04.c, i0> onDelete;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<o04.c, i0> onImageClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ai3.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super o04.c, i0> lVar, l<? super o04.c, i0> lVar2, l<? super v, i0> lVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = bVar;
            this.onAddFileClicked = aVar;
            this.addPhoto = aVar2;
            this.takePhoto = aVar3;
            this.onDelete = lVar;
            this.onImageClicked = lVar2;
            this.onBottomSheetStateChanged = lVar3;
            this.onGoToNextStep = aVar4;
            this.onBackAction = aVar5;
            this.onExitAction = aVar6;
        }

        public final er.a<i0> a() {
            return this.addPhoto;
        }

        public final er.a<i0> b() {
            return this.onAddFileClicked;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final l<v, i0> d() {
            return this.onBottomSheetStateChanged;
        }

        public final l<o04.c, i0> e() {
            return this.onDelete;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAddFileClicked, params.onAddFileClicked) && t.c(this.addPhoto, params.addPhoto) && t.c(this.takePhoto, params.takePhoto) && t.c(this.onDelete, params.onDelete) && t.c(this.onImageClicked, params.onImageClicked) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        public final er.a<i0> f() {
            return this.onExitAction;
        }

        public final er.a<i0> g() {
            return this.onGoToNextStep;
        }

        public final l<o04.c, i0> h() {
            return this.onImageClicked;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onAddFileClicked.hashCode()) * 31) + this.addPhoto.hashCode()) * 31) + this.takePhoto.hashCode()) * 31) + this.onDelete.hashCode()) * 31) + this.onImageClicked.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ai3.b getState() {
            return this.state;
        }

        public final er.a<i0> j() {
            return this.takePhoto;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddFileClicked=" + this.onAddFileClicked + ", addPhoto=" + this.addPhoto + ", takePhoto=" + this.takePhoto + ", onDelete=" + this.onDelete + ", onImageClicked=" + this.onImageClicked + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onGoToNextStep=" + this.onGoToNextStep + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27222a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(403656376);
            if (p076m2.t.k()) {
                p076m2.t.o(403656376, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclephotos.mapper.VehiclePhotosScreenMapper.invoke.<anonymous> (VehiclePhotosScreenMapper.kt:61)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public i(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ai3.b.Initialized.a aVar) {
        params.e().b(aVar.getFile());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, ai3.b.Initialized.a aVar) {
        params.h().b(aVar.getFile());
        return i0.f148189a;
    }

    private final Label l(float f15) {
        return this.labelProvider.e(md3.b.A, t04.a.c(f15));
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ai3.c.a b(final Params params) {
        int i15;
        n40.i.Image.AbstractC3255a image;
        ai3.b state = params.getState();
        if (t.c(state, ai3.b.a.f6447a)) {
            return ai3.c.a.C0140a.f6454a;
        }
        if (!(state instanceof ai3.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(md3.b.f125847v3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f27222a, null, params.f(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(md3.b.f125757k1);
        Label labelC2 = this.labelProvider.c(md3.b.f125693c1);
        Label labelC3 = this.labelProvider.c(md3.b.B);
        ai3.b.Initialized initialized = (ai3.b.Initialized) state;
        List<ai3.b.Initialized.a> listE = initialized.e();
        ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                FilePickerData filePickerData = new FilePickerData(labelC3, null, arrayList, pq.v.e(new n40.e.SelectionLimit(initialized.getFileImageConfiguration().getMaxFileAmount())), params.b(), initialized.getFileImageConfiguration().getMaxFileAmount());
                k30.a.Large large = new k30.a.Large(false, 1, null);
                k30.d.a aVar = k30.d.a.f107773a;
                mx.c cVar = this.labelProvider;
                boolean zIsEmpty = initialized.e().isEmpty();
                if (zIsEmpty) {
                    i15 = md3.b.W;
                } else {
                    if (zIsEmpty) {
                        throw new oq.p();
                    }
                    i15 = md3.b.K;
                }
                return new ai3.c.a.Initialized(baseScaffoldData, labelC, labelC2, filePickerData, new ButtonData(null, null, large, new k30.c.WithText(cVar.c(i15).n("nextButton"), null, 2, null), aVar, null, params.g(), 35, null), new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, params.d(), 2, null), null, null, null, 14, null), pq.v.q(new FileBottomSheetItemData(jz.a.f106760e0, this.labelProvider.c(md3.b.f125875z), params.a()), new FileBottomSheetItemData(jz.a.f106818m, this.labelProvider.c(md3.b.C), params.j())), this.labelProvider.c(md3.b.f125749j1), new ai3.c.TipItemData(md3.a.f125671h, this.labelProvider.c(md3.b.f125717f1)), new ai3.c.TipItemData(md3.a.f125673j, this.labelProvider.c(md3.b.f125733h1)), new ai3.c.TipItemData(md3.a.f125674k, this.labelProvider.c(md3.b.f125741i1)), new ai3.c.TipItemData(md3.a.f125672i, this.labelProvider.c(md3.b.f125725g1)), params.g());
            }
            final ai3.b.Initialized.a aVar2 = (ai3.b.Initialized.a) it.next();
            Label labelB = mx.b.b(aVar2.getName(), "fileName");
            Label labelL = l(aVar2.getFile().getOriginalMetadata().d());
            boolean z15 = aVar2.getBitmap() == null;
            if (z15) {
                image = n40.i.Image.AbstractC3255a.Icon.INSTANCE.a();
            } else {
                if (z15) {
                    throw new oq.p();
                }
                image = new n40.i.Image.AbstractC3255a.Image(aVar2.getBitmap());
            }
            arrayList.add(new n40.i.Image(labelB, labelL, new er.a() { // from class: ci3.g
                @Override // er.a
                public final Object a() {
                    return i.h(params, aVar2);
                }
            }, new er.a() { // from class: ci3.h
                @Override // er.a
                public final Object a() {
                    return i.i(params, aVar2);
                }
            }, image));
        }
    }
}
