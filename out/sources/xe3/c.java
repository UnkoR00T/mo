package xe3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.i;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import sv0.VehicleCollisionFileToDownload;
import x50.NavigationButtonData;
import xw.f;
import ye3.DownloadedThumbnail;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lxe3/c;", "Lxw/f;", "Lxe3/c$a;", "Lwe3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lxe3/c$a;)Lwe3/c$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, we3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xe3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lxe3/c$a;", "", "Lwe3/b;", "state", "Lkotlin/Function1;", "Lxe3/c$b;", "Loq/i0;", "onPhotoClick", "Lkotlin/Function0;", "onDownloadAllClick", "onClose", "<init>", "(Lwe3/b;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwe3/b;", "d", "()Lwe3/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final we3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PhotoClicked, i0> onPhotoClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadAllClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(we3.b bVar, l<? super PhotoClicked, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onPhotoClick = lVar;
            this.onDownloadAllClick = aVar;
            this.onClose = aVar2;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final er.a<i0> b() {
            return this.onDownloadAllClick;
        }

        public final l<PhotoClicked, i0> c() {
            return this.onPhotoClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final we3.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onPhotoClick, params.onPhotoClick) && t.c(this.onDownloadAllClick, params.onDownloadAllClick) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onPhotoClick.hashCode()) * 31) + this.onDownloadAllClick.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPhotoClick=" + this.onPhotoClick + ", onDownloadAllClick=" + this.onDownloadAllClick + ", onClose=" + this.onClose + ')';
        }
    }

    /* JADX INFO: renamed from: xe3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxe3/c$b;", "", "Lmx/a;", "name", "Lsv0/r0;", "file", "<init>", "(Lmx/a;Lsv0/r0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lsv0/r0;", "()Lsv0/r0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhotoClicked {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleCollisionFileToDownload file;

        public PhotoClicked(Label label, VehicleCollisionFileToDownload vehicleCollisionFileToDownload) {
            this.name = label;
            this.file = vehicleCollisionFileToDownload;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VehicleCollisionFileToDownload getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoClicked)) {
                return false;
            }
            PhotoClicked photoClicked = (PhotoClicked) other;
            return t.c(this.name, photoClicked.name) && t.c(this.file, photoClicked.file);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.file.hashCode();
        }

        public String toString() {
            return "PhotoClicked(name=" + this.name + ", file=" + this.file + ')';
        }
    }

    /* JADX INFO: renamed from: xe3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5834c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5834c f218293a = new C5834c();

        C5834c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2116041591);
            if (p076m2.t.k()) {
                p076m2.t.o(2116041591, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.photosdetails.mapper.PhotosDetailsScreenMapper.invoke.<anonymous>.<anonymous> (PhotosDetailsScreenMapper.kt:80)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, Label label, DownloadedThumbnail downloadedThumbnail) {
        params.c().b(new PhotoClicked(label, downloadedThumbnail.getFileToDownload().getOriginal()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, Label label, DownloadedThumbnail downloadedThumbnail) {
        params.c().b(new PhotoClicked(label, downloadedThumbnail.getFileToDownload().getOriginal()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public we3.c.a b(final Params params) {
        i roundedSquareIcon;
        we3.b state = params.getState();
        if (t.c(state, we3.b.C5623b.f212829a)) {
            return we3.c.a.C5624a.f212830a;
        }
        if (!(state instanceof we3.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(md3.b.P), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(md3.b.f125696c4);
        we3.b.Initialized initialized = (we3.b.Initialized) state;
        List<DownloadedThumbnail> listA = initialized.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final DownloadedThumbnail downloadedThumbnail = (DownloadedThumbnail) next;
            final Label labelE = this.labelProvider.e(md3.b.f125688b4, Integer.valueOf(i16));
            if (downloadedThumbnail.getThumbnailFileContent() != null) {
                roundedSquareIcon = new i.Image(downloadedThumbnail.getThumbnailFileContent(), null, new er.a() { // from class: xe3.a
                    @Override // er.a
                    public final Object a() {
                        return c.h(params, labelE, downloadedThumbnail);
                    }
                }, 2, null);
            } else {
                roundedSquareIcon = new i.RoundedSquareIcon(jz.a.M0, null, null, null, C5834c.f218293a, d40.i.C0865i.f39712e, new er.a() { // from class: xe3.b
                    @Override // er.a
                    public final Object a() {
                        return c.i(params, labelE, downloadedThumbnail);
                    }
                }, null, 142, null);
            }
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(labelE, null, null, 3, null)), null, 5, null), new LeadingSection(false, null, roundedSquareIcon, 3, null), null, null, 3327, null));
            i15 = i16;
        }
        return new we3.c.a.Initialized(baseScaffoldData, labelC, new CardListData(arrayList, null, false, null, null, 30, null), initialized.getSetupData().getEnteredFrom().getDownloadEnabled() ? new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md3.b.f125795p), null, 2, null), d.a.f107773a, null, params.b(), 35, null) : null);
    }
}
