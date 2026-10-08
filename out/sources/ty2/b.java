package ty2;

import android.graphics.Bitmap;
import dx.i;
import e20.k;
import er.l;
import ez.e;
import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.p;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import qy2.NipipCardContainerData;
import sy2.DocumentStateData;
import sy2.Error;
import sy2.n;
import sy2.q;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002;9B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020$*\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020$*\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010(J\u0015\u0010*\u001a\u0004\u0018\u00010$*\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010(J\u0015\u0010+\u001a\u0004\u0018\u00010$*\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010(J\u0015\u0010,\u001a\u0004\u0018\u00010$*\u00020\u0012H\u0002¢\u0006\u0004\b,\u0010(J;\u00102\u001a\u00020$*\u00020\u00122\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010/\u001a\u00020-2\b\b\u0001\u00100\u001a\u00020-2\b\b\u0001\u00101\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020$*\u00020\"2\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u00100\u001a\u00020-H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010B¨\u0006D"}, d2 = {"Lty2/b;", "Lxw/f;", "Lty2/b$b;", "Lsy2/q$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lez/e;", "dateFormatter", "Lp20/c;", "giloshScreenMapper", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lrz/a;Liy/a;Lez/e;Lp20/c;Lu04/a;)V", "Lsy2/l;", "documentStateData", "Lcb4/i;", "dialogVMS", "Lsy2/n;", "state", "Ly20/b;", "animationsState", "Lty2/b$b$a;", "actionHandler", "Lsy2/q$a$a;", "i", "(Lsy2/l;Lcb4/i;Lsy2/n;Ly20/b;Lty2/b$b$a;)Lsy2/q$a$a;", "Lo20/k;", "f", "(Lsy2/l;Lsy2/n;Ly20/b;Lty2/b$b$a;)Lo20/k;", "Lqy2/d$a;", "type", "Lmx/a;", "u", "(Lqy2/d$a;)Lmx/a;", "v", "(Lsy2/l;)Lmx/a;", "e", "s", "q", "r", "", "nurse", "nurseRestricted", "midwife", "midwifeRestricted", "m", "(Lsy2/l;IIII)Lmx/a;", "l", "(Lqy2/d$a;II)Lmx/a;", "params", "x", "(Lty2/b$b;)Lsy2/q$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "d", "Lez/e;", "Lp20/c;", "Lu04/a;", "g", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, q.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f192613h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: ty2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lty2/b$b;", "", "Lsy2/n;", "state", "Ly20/b;", "animationsState", "Lty2/b$b$a;", "action", "<init>", "(Lsy2/n;Ly20/b;Lty2/b$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy2/n;", "c", "()Lsy2/n;", "b", "Ly20/b;", "()Ly20/b;", "Lty2/b$b$a;", "()Lty2/b$b$a;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f192620d = y20.b.f223429b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y20.b animationsState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ActionHandler action;

        /* JADX INFO: renamed from: ty2.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0019\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006$"}, d2 = {"Lty2/b$b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onVerificationClicked", "onUpdateClicked", "onGetNewDocumentClicked", "Lkotlin/Function1;", "", "onUrlClick", "onDeleteClicked", "Ln20/a;", "dispatchAction", "onBack", "<init>", "(Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "g", "()Ler/a;", "b", "e", "c", "d", "Ler/l;", "f", "()Ler/l;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onVerificationClicked;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onUpdateClicked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGetNewDocumentClicked;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<String, i0> onUrlClick;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onDeleteClicked;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<n20.a, i0> dispatchAction;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX WARN: Multi-variable type inference failed */
            public ActionHandler(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, er.a<i0> aVar4, l<? super n20.a, i0> lVar2, er.a<i0> aVar5) {
                this.onVerificationClicked = aVar;
                this.onUpdateClicked = aVar2;
                this.onGetNewDocumentClicked = aVar3;
                this.onUrlClick = lVar;
                this.onDeleteClicked = aVar4;
                this.dispatchAction = lVar2;
                this.onBack = aVar5;
            }

            public final l<n20.a, i0> a() {
                return this.dispatchAction;
            }

            public final er.a<i0> b() {
                return this.onBack;
            }

            public final er.a<i0> c() {
                return this.onDeleteClicked;
            }

            public final er.a<i0> d() {
                return this.onGetNewDocumentClicked;
            }

            public final er.a<i0> e() {
                return this.onUpdateClicked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionHandler)) {
                    return false;
                }
                ActionHandler actionHandler = (ActionHandler) other;
                return t.c(this.onVerificationClicked, actionHandler.onVerificationClicked) && t.c(this.onUpdateClicked, actionHandler.onUpdateClicked) && t.c(this.onGetNewDocumentClicked, actionHandler.onGetNewDocumentClicked) && t.c(this.onUrlClick, actionHandler.onUrlClick) && t.c(this.onDeleteClicked, actionHandler.onDeleteClicked) && t.c(this.dispatchAction, actionHandler.dispatchAction) && t.c(this.onBack, actionHandler.onBack);
            }

            public final l<String, i0> f() {
                return this.onUrlClick;
            }

            public final er.a<i0> g() {
                return this.onVerificationClicked;
            }

            public int hashCode() {
                return (((((((((((this.onVerificationClicked.hashCode() * 31) + this.onUpdateClicked.hashCode()) * 31) + this.onGetNewDocumentClicked.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onDeleteClicked.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "ActionHandler(onVerificationClicked=" + this.onVerificationClicked + ", onUpdateClicked=" + this.onUpdateClicked + ", onGetNewDocumentClicked=" + this.onGetNewDocumentClicked + ", onUrlClick=" + this.onUrlClick + ", onDeleteClicked=" + this.onDeleteClicked + ", dispatchAction=" + this.dispatchAction + ", onBack=" + this.onBack + ')';
            }
        }

        public Params(n nVar, y20.b bVar, ActionHandler actionHandler) {
            this.state = nVar;
            this.animationsState = bVar;
            this.action = actionHandler;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionHandler getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y20.b getAnimationsState() {
            return this.animationsState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n getState() {
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
            return t.c(this.state, params.state) && t.c(this.animationsState, params.animationsState) && t.c(this.action, params.action);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.animationsState.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", animationsState=" + this.animationsState + ", action=" + this.action + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f192632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f192633c;

        static {
            int[] iArr = new int[NipipCardContainerData.b.values().length];
            try {
                iArr[NipipCardContainerData.b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NipipCardContainerData.b.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NipipCardContainerData.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f192631a = iArr;
            int[] iArr2 = new int[NipipCardContainerData.c.values().length];
            try {
                iArr2[NipipCardContainerData.c.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NipipCardContainerData.c.FIXED_TERM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NipipCardContainerData.c.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NipipCardContainerData.c.UNDER_SUPERVISION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f192632b = iArr2;
            int[] iArr3 = new int[NipipCardContainerData.a.values().length];
            try {
                iArr3[NipipCardContainerData.a.NURSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NipipCardContainerData.a.MIDWIFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f192633c = iArr3;
        }
    }

    public b(mx.c cVar, rz.a aVar, iy.a aVar2, e eVar, p20.c cVar2, u04.a aVar3) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.dateFormatter = eVar;
        this.giloshScreenMapper = cVar2;
        this.commonEndpoints = aVar3;
    }

    private final Label e(DocumentStateData documentStateData) {
        return m(documentStateData, oy2.a.G, oy2.a.H, oy2.a.f150695w, oy2.a.f150696x);
    }

    private final BaseDocumentData f(DocumentStateData documentStateData, n state, y20.b animationsState, Params.ActionHandler actionHandler) {
        Object objB;
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.q(new SmallCardData(null, this.labelProvider.c(oy2.a.R), null, jz.a.f106785h1, o50.f.c.f142478a, false, actionHandler.g(), 37, null), new SmallCardData(null, this.labelProvider.c(oy2.a.f150676d), null, jz.a.f106727a, o50.f.b.f142477a, false, actionHandler.c(), 37, null)), new ShortcutMoreData(this.labelProvider.c(oy2.a.f150677e), new l() { // from class: ty2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h((List) obj);
            }
        })));
        o20.l.Button button = new o20.l.Button(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(documentStateData.getData().getScope().getData().m() ? oy2.a.f150689q : oy2.a.f150688p), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.d(documentStateData.getData().getScope().getData().getIssuerName(), "issuerNameValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
        Label labelC = this.labelProvider.c(oy2.a.f150681i);
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(documentStateData.getData().getScope().getDataHeader().getTs());
        fz.c cVar = fz.c.DOTTED;
        List listS = v.s(shortcuts, button, new o20.l.UpdateDataItem(labelC, mx.b.d(eVar.d(offsetDateTime, cVar), "nurseLastUpdateValue"), this.labelProvider.c(oy2.a.f150682j), null, actionHandler.e(), 8, null));
        p20.c cVar2 = this.giloshScreenMapper;
        State state2 = new State(state, animationsState);
        p.y yVar = p.y.f140972c;
        rz.a aVar = this.bitmapDecoder;
        i iVarC = iy.a.c(this.base64Coder, documentStateData.getData().getScope().getData().getPhoto(), null, 2, null);
        if (iVarC instanceof i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof i.Right)) {
                throw new oq.p();
            }
            objB = ((i.Right) iVarC).b();
        }
        Bitmap bitmapA = aVar.a((byte[]) objB);
        boolean zE = documentStateData.getData().getStatus().e();
        Label labelC2 = this.labelProvider.c(documentStateData.getData().getStatus().e() ? oy2.a.f150683k : oy2.a.f150680h);
        StringBuilder sb5 = new StringBuilder();
        String strE = c0.e(documentStateData.getData().getScope().getData().getName());
        Locale locale = Locale.ROOT;
        sb5.append(strE.toUpperCase(locale));
        b0 secondName = documentStateData.getData().getScope().getData().getSecondName();
        if (secondName != null) {
            sb5.append(' ' + c0.e(secondName).toUpperCase(locale));
        }
        i0 i0Var = i0.f148189a;
        DocumentGiloshData documentGiloshDataB = cVar2.b(new p20.c.Params(v.q(new u2.Flag(k.Poland, this.labelProvider.c(oy2.a.f150675c)), new u2.Hologram(null, null, 3, null)), state2, yVar, bitmapA, null, null, null, zE, labelC2, this.labelProvider.c(oy2.a.f150694v), actionHandler.d(), v.q(new KeyValueData(mx.b.d(sb5.toString(), "namesValue"), this.labelProvider.c(oy2.a.f150684l), false, 4, null), new KeyValueData(mx.b.d(c0.e(documentStateData.getData().getScope().getData().getSurname()).toUpperCase(locale), "surnameValue"), this.labelProvider.c(oy2.a.f150685m), false, 4, null), new KeyValueData(mx.b.d(documentStateData.getData().getScope().getData().getProfessionalTitle().toUpperCase(locale), "professionalTitleValue"), this.labelProvider.c(oy2.a.Q), false, 4, null), new KeyValueData(mx.b.d(documentStateData.getData().getScope().getData().getDocumentNumber(), "documentNumberValue"), this.labelProvider.c(documentStateData.getData().getScope().getData().m() ? oy2.a.f150693u : oy2.a.f150692t), false, 4, null), new KeyValueData(mx.b.d(this.dateFormatter.d(new fz.b.LocalDate(documentStateData.getData().getScope().getData().getCreationDate()), cVar), "creationDateValue"), this.labelProvider.c(documentStateData.getData().getScope().getData().m() ? oy2.a.f150691s : oy2.a.f150690r), false, 4, null)), null, null, actionHandler.a(), documentStateData.getDocumentVMS(), 12400, null));
        List listE = v.e(new o20.l.Button(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(documentStateData.getData().getScope().getData().getDocumentName(), "documentTitleValue"), null, null, 3, null)), n50.l.b(v(documentStateData), null, null, 3, null), 1, null), null, null, null, 3839, null)));
        c30.b.c cVar3 = new c30.b.c(null, null, null, e(documentStateData), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(oy2.a.f150687o), this.commonEndpoints.n0(), LinkData.EnumC5775a.WEBSITE, false, actionHandler.f(), 17, null)), 55, null);
        Label labelS = s(documentStateData);
        return new BaseDocumentData(null, null, listE, documentGiloshDataB, listS, null, v.s(cVar3, labelS != null ? new c30.b.c(null, null, null, labelS, null, null, null, 119, null) : null), 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list) {
        return i0.f148189a;
    }

    private final q.a.DocumentView i(DocumentStateData documentStateData, cb4.i dialogVMS, n state, y20.b animationsState, Params.ActionHandler actionHandler) {
        return new q.a.DocumentView(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), actionHandler.b()), u(documentStateData.getData().getScope().getData().getPwzType()), null, null, null, 28, null), null, null, null, null, 61, null), dialogVMS, f(documentStateData, state, animationsState, actionHandler), actionHandler.b());
    }

    private final Label l(NipipCardContainerData.a aVar, int i15, int i16) {
        mx.c cVar = this.labelProvider;
        int i17 = c.f192633c[aVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                throw new oq.p();
            }
            i15 = i16;
        }
        return cVar.c(i15);
    }

    private final Label m(DocumentStateData documentStateData, int i15, int i16, int i17, int i18) {
        return documentStateData.getData().getScope().getData().m() ? l(documentStateData.getData().getScope().getData().getPwzType(), i16, i18) : l(documentStateData.getData().getScope().getData().getPwzType(), i15, i17);
    }

    private final Label q(DocumentStateData documentStateData) {
        NipipCardContainerData.c restrictionType = documentStateData.getData().getScope().getData().getRestrictionType();
        int i15 = restrictionType == null ? -1 : c.f192632b[restrictionType.ordinal()];
        if (i15 == 1) {
            return l(documentStateData.getData().getScope().getData().getPwzType(), oy2.a.L, oy2.a.B);
        }
        if (i15 == 2) {
            return l(documentStateData.getData().getScope().getData().getPwzType(), oy2.a.I, oy2.a.f150697y);
        }
        if (i15 == 3) {
            return l(documentStateData.getData().getScope().getData().getPwzType(), oy2.a.K, oy2.a.A);
        }
        if (i15 != 4) {
            return null;
        }
        return l(documentStateData.getData().getScope().getData().getPwzType(), oy2.a.M, oy2.a.C);
    }

    private final Label r(DocumentStateData documentStateData) {
        NipipCardContainerData.c restrictionType = documentStateData.getData().getScope().getData().getRestrictionType();
        if ((restrictionType == null ? -1 : c.f192632b[restrictionType.ordinal()]) == 2) {
            return l(documentStateData.getData().getScope().getData().getPwzType(), oy2.a.J, oy2.a.f150698z);
        }
        return null;
    }

    private final Label s(DocumentStateData documentStateData) {
        int i15 = c.f192631a[documentStateData.getData().getScope().getData().getRestriction().ordinal()];
        if (i15 == 1) {
            return q(documentStateData);
        }
        if (i15 == 2) {
            return r(documentStateData);
        }
        if (i15 == 3) {
            return null;
        }
        throw new oq.p();
    }

    private final Label u(NipipCardContainerData.a type) {
        return l(type, oy2.a.P, oy2.a.F);
    }

    private final Label v(DocumentStateData documentStateData) {
        return m(documentStateData, oy2.a.N, oy2.a.O, oy2.a.D, oy2.a.E);
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public q.a b(Params params) {
        cb4.i dialogVMS;
        n state = params.getState();
        if (!t.c(state, n.d.f185820a) && !t.c(state, sy2.p.f185824a)) {
            if (state instanceof n.c.Screen) {
                n.c.Screen screen = (n.c.Screen) state;
                return i(screen.getDocumentStateData(), null, screen, params.getAnimationsState(), params.getAction());
            }
            if (state instanceof n.b) {
                n.b bVar = (n.b) state;
                return i(bVar.getDocumentStateData(), null, bVar, params.getAnimationsState(), params.getAction());
            }
            if (!(state instanceof n.a)) {
                if (state instanceof Error) {
                    return new q.a.Error(((Error) state).getErrorVMS());
                }
                if (state instanceof n.c.UpdateError) {
                    return new q.a.Error(((n.c.UpdateError) state).getErrorVMS());
                }
                throw new oq.p();
            }
            n.a aVar = (n.a) state;
            if (aVar instanceof n.a.Screen) {
                dialogVMS = null;
            } else {
                if (!(aVar instanceof n.a.Dialog)) {
                    throw new oq.p();
                }
                dialogVMS = ((n.a.Dialog) state).getDialogVMS();
            }
            return i(aVar.getDocumentStateData(), dialogVMS, aVar, params.getAnimationsState(), params.getAction());
        }
        return q.a.c.f185831a;
    }
}
