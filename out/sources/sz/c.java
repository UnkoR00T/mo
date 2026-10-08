package sz;

import androidx.camera.view.m;
import androidx.p016lifecycle.q;
import fr.k;
import fr.t;
import o.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lsz/c;", "", "<init>", "()V", "b", "a", "c", "Lsz/c$a;", "Lsz/c$b;", "Lsz/c$c;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: sz.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\"\u0010-¨\u0006."}, d2 = {"Lsz/c$a;", "Lsz/c;", "Lvz/a;", "cameraUseCase", "Lo/s;", "cameraSelector", "Landroidx/lifecycle/q;", "lifecycleOwner", "Landroidx/camera/view/m;", "previewView", "Luz/a;", "processCameraProvider", "Lsx/b;", "mode", "<init>", "(Lvz/a;Lo/s;Landroidx/lifecycle/q;Landroidx/camera/view/m;Luz/a;Lsx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvz/a;", "()Lvz/a;", "b", "Lo/s;", "getCameraSelector", "()Lo/s;", "c", "Landroidx/lifecycle/q;", "()Landroidx/lifecycle/q;", "d", "Landroidx/camera/view/m;", "()Landroidx/camera/view/m;", "e", "Luz/a;", "()Luz/a;", "f", "Lsx/b;", "()Lsx/b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vz.a cameraUseCase;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s cameraSelector;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q lifecycleOwner;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final m previewView;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final uz.a processCameraProvider;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final sx.b mode;

        public Initialized(vz.a aVar, s sVar, q qVar, m mVar, uz.a aVar2, sx.b bVar) {
            super(null);
            this.cameraUseCase = aVar;
            this.cameraSelector = sVar;
            this.lifecycleOwner = qVar;
            this.previewView = mVar;
            this.processCameraProvider = aVar2;
            this.mode = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vz.a getCameraUseCase() {
            return this.cameraUseCase;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final q getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final sx.b getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getPreviewView() {
            return this.previewView;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final uz.a getProcessCameraProvider() {
            return this.processCameraProvider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return t.c(this.cameraUseCase, initialized.cameraUseCase) && t.c(this.cameraSelector, initialized.cameraSelector) && t.c(this.lifecycleOwner, initialized.lifecycleOwner) && t.c(this.previewView, initialized.previewView) && t.c(this.processCameraProvider, initialized.processCameraProvider) && t.c(this.mode, initialized.mode);
        }

        public int hashCode() {
            return (((((((((this.cameraUseCase.hashCode() * 31) + this.cameraSelector.hashCode()) * 31) + this.lifecycleOwner.hashCode()) * 31) + this.previewView.hashCode()) * 31) + this.processCameraProvider.hashCode()) * 31) + this.mode.hashCode();
        }

        public String toString() {
            return "Initialized(cameraUseCase=" + this.cameraUseCase + ", cameraSelector=" + this.cameraSelector + ", lifecycleOwner=" + this.lifecycleOwner + ", previewView=" + this.previewView + ", processCameraProvider=" + this.processCameraProvider + ", mode=" + this.mode + ')';
        }
    }

    /* JADX INFO: renamed from: sz.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lsz/c$b;", "Lsz/c;", "Lsx/b;", "mode", "Landroidx/lifecycle/q;", "lifecycleOwner", "Landroidx/camera/view/m;", "previewView", "<init>", "(Lsx/b;Landroidx/lifecycle/q;Landroidx/camera/view/m;)V", "a", "(Lsx/b;Landroidx/lifecycle/q;Landroidx/camera/view/m;)Lsz/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsx/b;", "d", "()Lsx/b;", "b", "Landroidx/lifecycle/q;", "c", "()Landroidx/lifecycle/q;", "Landroidx/camera/view/m;", "e", "()Landroidx/camera/view/m;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initializing extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sx.b mode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q lifecycleOwner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final m previewView;

        public Initializing() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Initializing b(Initializing initializing, sx.b bVar, q qVar, m mVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = initializing.mode;
            }
            if ((i15 & 2) != 0) {
                qVar = initializing.lifecycleOwner;
            }
            if ((i15 & 4) != 0) {
                mVar = initializing.previewView;
            }
            return initializing.a(bVar, qVar, mVar);
        }

        public final Initializing a(sx.b mode, q lifecycleOwner, m previewView) {
            return new Initializing(mode, lifecycleOwner, previewView);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final q getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final sx.b getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m getPreviewView() {
            return this.previewView;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initializing)) {
                return false;
            }
            Initializing initializing = (Initializing) other;
            return t.c(this.mode, initializing.mode) && t.c(this.lifecycleOwner, initializing.lifecycleOwner) && t.c(this.previewView, initializing.previewView);
        }

        public int hashCode() {
            sx.b bVar = this.mode;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            q qVar = this.lifecycleOwner;
            int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
            m mVar = this.previewView;
            return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
        }

        public String toString() {
            return "Initializing(mode=" + this.mode + ", lifecycleOwner=" + this.lifecycleOwner + ", previewView=" + this.previewView + ')';
        }

        public Initializing(sx.b bVar, q qVar, m mVar) {
            super(null);
            this.mode = bVar;
            this.lifecycleOwner = qVar;
            this.previewView = mVar;
        }

        public /* synthetic */ Initializing(sx.b bVar, q qVar, m mVar, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? null : qVar, (i15 & 4) != 0 ? null : mVar);
        }
    }

    /* JADX INFO: renamed from: sz.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Lsz/c$c;", "Lsz/c;", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lvz/a;", "cameraUseCase", "Landroidx/camera/view/m;", "previewView", "Luz/a;", "processCameraProvider", "Lsx/b;", "mode", "<init>", "(Landroidx/lifecycle/q;Lvz/a;Landroidx/camera/view/m;Luz/a;Lsx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/lifecycle/q;", "b", "()Landroidx/lifecycle/q;", "Lvz/a;", "()Lvz/a;", "c", "Landroidx/camera/view/m;", "d", "()Landroidx/camera/view/m;", "Luz/a;", "e", "()Luz/a;", "Lsx/b;", "()Lsx/b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stopped extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q lifecycleOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final vz.a cameraUseCase;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final m previewView;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final uz.a processCameraProvider;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final sx.b mode;

        public Stopped(q qVar, vz.a aVar, m mVar, uz.a aVar2, sx.b bVar) {
            super(null);
            this.lifecycleOwner = qVar;
            this.cameraUseCase = aVar;
            this.previewView = mVar;
            this.processCameraProvider = aVar2;
            this.mode = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vz.a getCameraUseCase() {
            return this.cameraUseCase;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final q getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final sx.b getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getPreviewView() {
            return this.previewView;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final uz.a getProcessCameraProvider() {
            return this.processCameraProvider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stopped)) {
                return false;
            }
            Stopped stopped = (Stopped) other;
            return t.c(this.lifecycleOwner, stopped.lifecycleOwner) && t.c(this.cameraUseCase, stopped.cameraUseCase) && t.c(this.previewView, stopped.previewView) && t.c(this.processCameraProvider, stopped.processCameraProvider) && t.c(this.mode, stopped.mode);
        }

        public int hashCode() {
            return (((((((this.lifecycleOwner.hashCode() * 31) + this.cameraUseCase.hashCode()) * 31) + this.previewView.hashCode()) * 31) + this.processCameraProvider.hashCode()) * 31) + this.mode.hashCode();
        }

        public String toString() {
            return "Stopped(lifecycleOwner=" + this.lifecycleOwner + ", cameraUseCase=" + this.cameraUseCase + ", previewView=" + this.previewView + ", processCameraProvider=" + this.processCameraProvider + ", mode=" + this.mode + ')';
        }
    }

    public /* synthetic */ c(k kVar) {
        this();
    }

    private c() {
    }
}
