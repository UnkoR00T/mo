package hw1;

import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import gv1.DocumentActionAttribute;
import gv1.DocumentDynamicSection;
import gv1.DocumentSchema;
import gv1.DocumentsGroup;
import gv1.s;
import h30.ButtonData;
import hv1.MultiDocumentSchema;
import hv1.MultiDocumentView;
import i50.BaseScaffoldData;
import iy.b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mv1.DynamicDocumentData;
import mx.Label;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o20.s2;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import wv1.DynamicDocumentBottomSheetData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001c*\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J3\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#*\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00110\u001bH\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020-¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020-¢\u0006\u0004\b1\u0010/J\r\u00102\u001a\u00020-¢\u0006\u0004\b2\u0010/J\r\u00103\u001a\u00020-¢\u0006\u0004\b3\u0010/J\r\u00104\u001a\u00020-¢\u0006\u0004\b4\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lhw1/e;", "Lxw/f;", "Lhw1/e$a;", "Lgw1/d$a;", "Lvv1/f;", "dynamicDocumentMapper", "Lmx/c;", "labelProvider", "Lev1/a;", "dynamicDocumentSchemaDecoder", "<init>", "(Lvv1/f;Lmx/c;Lev1/a;)V", "", "shortDocumentName", "Lgv1/i;", "schema", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onEscape", "Li50/a;", "i", "(Ljava/lang/String;Lgv1/i;Ler/a;Ler/a;)Li50/a;", "Lgw1/a;", "openedTab", "Lhv1/a;", "multiDocumentSchema", "Lkotlin/Function1;", "Ly30/n$b$b;", "tabChangedAction", "Ly30/n$b;", "m", "(Lgw1/a;Lhv1/a;Ler/l;)Ly30/n$b;", "I", "(Lgw1/a;)Ly30/n$b$b;", "", "Lmv1/c;", "", "onCardClick", "Ln50/g;", "G", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "params", "z", "(Lhw1/e$a;)Lgw1/d$a;", "Lmx/a;", "v", "()Lmx/a;", "u", "x", "q", "r", "s", "a", "Lvv1/f;", "b", "Lmx/c;", "c", "Lev1/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, gw1.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vv1.f dynamicDocumentMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: hw1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u000f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u000f\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b(\u00102R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00102R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b5\u00102R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00102R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b,\u00102R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b7\u00102R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b:\u0010;R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\b<\u0010;R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b3\u0010;R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b0\u00102R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b?\u0010;R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b>\u0010;R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b8\u00102¨\u0006@"}, d2 = {"Lhw1/e$a;", "", "Ln20/b;", "Lgw1/c;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "hideSnackBarAction", "downloadDocumentAction", "updateDocumentAction", "confirmDocumentAction", "goToSafeBus", "Lkotlin/Function1;", "Lgv1/c$a;", "onHandleActionType", "", "openAnnotationLink", "Ly30/n$b$b;", "tabChangedAction", "Ln20/a;", "dispatchAction", "deleteDocumentAction", "", "toSingleDocument", "Lwv1/b;", "showBottomSheet", "hideBottomSheet", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "m", "()Ln20/b;", "b", "Lo20/s2;", "e", "()Lo20/s2;", "c", "Ler/a;", "()Ler/a;", "d", "i", "f", "p", "g", "h", "Ler/l;", "j", "()Ler/l;", "k", "n", "l", "o", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<gw1.c> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadDocumentAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmDocumentAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSafeBus;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DocumentActionAttribute.a, i0> onHandleActionType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openAnnotationLink;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> tabChangedAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> toSingleDocument;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DynamicDocumentBottomSheetData, i0> showBottomSheet;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<gw1.c> state, s2 s2Var, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super DocumentActionAttribute.a, i0> lVar, l<? super String, i0> lVar2, l<? super n.Switch.EnumC5973b, i0> lVar3, l<? super n20.a, i0> lVar4, er.a<i0> aVar7, l<? super Integer, i0> lVar5, l<? super DynamicDocumentBottomSheetData, i0> lVar6, er.a<i0> aVar8) {
            this.state = state;
            this.documentVMS = s2Var;
            this.closeAction = aVar;
            this.hideSnackBarAction = aVar2;
            this.downloadDocumentAction = aVar3;
            this.updateDocumentAction = aVar4;
            this.confirmDocumentAction = aVar5;
            this.goToSafeBus = aVar6;
            this.onHandleActionType = lVar;
            this.openAnnotationLink = lVar2;
            this.tabChangedAction = lVar3;
            this.dispatchAction = lVar4;
            this.deleteDocumentAction = aVar7;
            this.toSingleDocument = lVar5;
            this.showBottomSheet = lVar6;
            this.hideBottomSheet = aVar8;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.confirmDocumentAction;
        }

        public final er.a<i0> c() {
            return this.deleteDocumentAction;
        }

        public final l<n20.a, i0> d() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.closeAction, params.closeAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction) && t.c(this.downloadDocumentAction, params.downloadDocumentAction) && t.c(this.updateDocumentAction, params.updateDocumentAction) && t.c(this.confirmDocumentAction, params.confirmDocumentAction) && t.c(this.goToSafeBus, params.goToSafeBus) && t.c(this.onHandleActionType, params.onHandleActionType) && t.c(this.openAnnotationLink, params.openAnnotationLink) && t.c(this.tabChangedAction, params.tabChangedAction) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.deleteDocumentAction, params.deleteDocumentAction) && t.c(this.toSingleDocument, params.toSingleDocument) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.hideBottomSheet, params.hideBottomSheet);
        }

        public final er.a<i0> f() {
            return this.downloadDocumentAction;
        }

        public final er.a<i0> g() {
            return this.goToSafeBus;
        }

        public final er.a<i0> h() {
            return this.hideBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode()) * 31) + this.downloadDocumentAction.hashCode()) * 31) + this.updateDocumentAction.hashCode()) * 31) + this.confirmDocumentAction.hashCode()) * 31) + this.goToSafeBus.hashCode()) * 31) + this.onHandleActionType.hashCode()) * 31) + this.openAnnotationLink.hashCode()) * 31) + this.tabChangedAction.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.toSingleDocument.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.hideBottomSheet.hashCode();
        }

        public final er.a<i0> i() {
            return this.hideSnackBarAction;
        }

        public final l<DocumentActionAttribute.a, i0> j() {
            return this.onHandleActionType;
        }

        public final l<String, i0> k() {
            return this.openAnnotationLink;
        }

        public final l<DynamicDocumentBottomSheetData, i0> l() {
            return this.showBottomSheet;
        }

        public final State<gw1.c> m() {
            return this.state;
        }

        public final l<n.Switch.EnumC5973b, i0> n() {
            return this.tabChangedAction;
        }

        public final l<Integer, i0> o() {
            return this.toSingleDocument;
        }

        public final er.a<i0> p() {
            return this.updateDocumentAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", closeAction=" + this.closeAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ", downloadDocumentAction=" + this.downloadDocumentAction + ", updateDocumentAction=" + this.updateDocumentAction + ", confirmDocumentAction=" + this.confirmDocumentAction + ", goToSafeBus=" + this.goToSafeBus + ", onHandleActionType=" + this.onHandleActionType + ", openAnnotationLink=" + this.openAnnotationLink + ", tabChangedAction=" + this.tabChangedAction + ", dispatchAction=" + this.dispatchAction + ", deleteDocumentAction=" + this.deleteDocumentAction + ", toSingleDocument=" + this.toSingleDocument + ", showBottomSheet=" + this.showBottomSheet + ", hideBottomSheet=" + this.hideBottomSheet + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f86785b;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86784a = iArr;
            int[] iArr2 = new int[gw1.a.values().length];
            try {
                iArr2[gw1.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gw1.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f86785b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((n50.b.Title) ((DefaultSingleCardData) t15).getBodySection().getTitle()).getSingleCardLabel().getLabel().getText(), ((n50.b.Title) ((DefaultSingleCardData) t16).getBodySection().getTitle()).getSingleCardLabel().getLabel().getText());
        }
    }

    public e(vv1.f fVar, mx.c cVar, ev1.a aVar) {
        this.dynamicDocumentMapper = fVar;
        this.labelProvider = cVar;
        this.dynamicDocumentSchemaDecoder = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, v vVar) {
        int i15 = b.f86784a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new p();
            }
            params.h().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(v vVar) {
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> G(List<DynamicDocumentData> list, final l<? super Integer, i0> lVar) {
        SingleCardLabel singleCardLabel;
        Label labelB;
        DocumentDynamicSection dynamicSections;
        DocumentDynamicSection dynamicSections2;
        Label labelB2;
        DocumentDynamicSection dynamicSections3;
        List<DynamicDocumentData> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator it = list2.iterator();
        final int i15 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) next;
            ev1.a aVar = this.dynamicDocumentSchemaDecoder;
            s sVar = s.NAME;
            MultiDocumentView multiDocumentView = dynamicDocumentData.getSchema().getMultiDocumentView();
            SingleCardLabel singleCardLabel2 = null;
            String strF = ev1.a.f(aVar, sVar, null, (multiDocumentView == null || (dynamicSections3 = multiDocumentView.getDynamicSections()) == null) ? null : dynamicSections3.c(), null, dynamicDocumentData.getScope(), null, 40, null);
            if (strF == null || (labelB2 = mx.b.b(strF, "info")) == null) {
                singleCardLabel = null;
            } else {
                SingleCardLabel singleCardLabel3 = new SingleCardLabel(labelB2, null, null, 0, 0, null, 62, null);
                if (labelB2.getText().length() <= 0) {
                    singleCardLabel3 = null;
                }
                singleCardLabel = singleCardLabel3;
            }
            ev1.a aVar2 = this.dynamicDocumentSchemaDecoder;
            MultiDocumentView multiDocumentView2 = dynamicDocumentData.getSchema().getMultiDocumentView();
            Iterator it4 = it;
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.d(ev1.a.f(aVar2, sVar, null, (multiDocumentView2 == null || (dynamicSections2 = multiDocumentView2.getDynamicSections()) == null) ? null : dynamicSections2.a(), null, dynamicDocumentData.getScope(), null, 40, null), "documentTitle"), null, null, 0, 0, null, 62, null));
            ev1.a aVar3 = this.dynamicDocumentSchemaDecoder;
            MultiDocumentView multiDocumentView3 = dynamicDocumentData.getSchema().getMultiDocumentView();
            String strF2 = ev1.a.f(aVar3, sVar, null, (multiDocumentView3 == null || (dynamicSections = multiDocumentView3.getDynamicSections()) == null) ? null : dynamicSections.b(), null, dynamicDocumentData.getScope(), null, 40, null);
            if (strF2 != null && (labelB = mx.b.b(strF2, "description")) != null) {
                SingleCardLabel singleCardLabel4 = new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null);
                if (labelB.getText().length() > 0) {
                    singleCardLabel2 = singleCardLabel4;
                }
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: hw1.c
                @Override // er.a
                public final Object a() {
                    return e.H(lVar, i15);
                }
            }, false, null, null, false, null, null, new BodySection(singleCardLabel, title, singleCardLabel2), null, x0.Icon.INSTANCE.b(), null, 2813, null));
            it = it4;
            i15 = i16;
        }
        return pq.v.U0(arrayList, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    private final n.Switch.EnumC5973b I(gw1.a aVar) {
        int i15 = b.f86785b[aVar.ordinal()];
        if (i15 == 1) {
            return n.Switch.EnumC5973b.LEFT;
        }
        if (i15 == 2) {
            return n.Switch.EnumC5973b.RIGHT;
        }
        throw new p();
    }

    private final BaseScaffoldData i(String shortDocumentName, DocumentSchema schema, er.a<i0> onBack, final er.a<i0> onEscape) {
        Label labelB;
        if (shortDocumentName == null || (labelB = mx.b.b(shortDocumentName, "topBarTitle")) == null) {
            labelB = mx.b.b(schema.getDocumentName(), "topBarTitle");
        }
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), labelB, null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: hw1.d
            @Override // er.a
            public final Object a() {
                return e.l(onEscape);
            }
        })), null, null, 53, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    private final n.Switch m(gw1.a openedTab, MultiDocumentSchema multiDocumentSchema, l<? super n.Switch.EnumC5973b, i0> tabChangedAction) {
        Label labelC;
        Label labelC2;
        if (openedTab == null) {
            return null;
        }
        ev1.a aVar = this.dynamicDocumentSchemaDecoder;
        DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
        String strA = aVar.a(leftTab != null ? leftTab.a() : null);
        if (strA == null || (labelC = mx.b.b(strA, "dynamicDocumentSchemaDecoderTabLeftItem")) == null) {
            labelC = Label.INSTANCE.c();
        }
        n.Switch.TabItem tabItem = new n.Switch.TabItem(labelC, n.Switch.EnumC5973b.LEFT);
        ev1.a aVar2 = this.dynamicDocumentSchemaDecoder;
        DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
        String strA2 = aVar2.a(rightTab != null ? rightTab.a() : null);
        if (strA2 == null || (labelC2 = mx.b.b(strA2, "dynamicDocumentSchemaDecoderTabRightItem")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        return new n.Switch(tabItem, new n.Switch.TabItem(labelC2, n.Switch.EnumC5973b.RIGHT), I(openedTab), false, tabChangedAction, 8, null);
    }

    public final Label q() {
        return this.labelProvider.c(dv1.a.f44627c);
    }

    public final Label r() {
        return this.labelProvider.c(dv1.a.f44648m0);
    }

    public final Label s() {
        return this.labelProvider.c(dv1.a.f44633f);
    }

    public final Label u() {
        return this.labelProvider.c(dv1.a.f44644k0);
    }

    public final Label v() {
        return this.labelProvider.c(dv1.a.f44646l0);
    }

    public final Label x() {
        return this.labelProvider.c(dv1.a.f44659s);
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public gw1.d.a b(final Params params) {
        gw1.c cVarD = params.m().d();
        if (t.c(cVarD, gw1.c.a.f77890a) || (cVarD instanceof gw1.c.Loading)) {
            return gw1.d.a.C1765a.f77906a;
        }
        if (!(cVarD instanceof gw1.c.Initialized)) {
            throw new p();
        }
        gw1.c.Initialized initialized = (gw1.c.Initialized) cVarD;
        if (initialized.g().size() != 1) {
            return new gw1.d.a.b.DocumentsList(G(initialized.g(), params.o()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(dv1.a.f44661t), null, 2, null), k30.d.a.f107773a, null, params.p(), 35, null), i(initialized.getDocumentShortName(), ((DynamicDocumentData) pq.v.l0(initialized.g())).getSchema(), params.a(), params.h()), m(initialized.getOpenedTab(), initialized.getMultiDocumentSchema(), params.n()), params.a(), params.i(), new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, new l() { // from class: hw1.b
                @Override // er.l
                public final Object b(Object obj) {
                    return e.F((v) obj);
                }
            }, 2, null), null, null, null, 14, null), null, 128, null);
        }
        vv1.f fVar = this.dynamicDocumentMapper;
        State<gw1.c> stateM = params.m();
        DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) pq.v.l0(initialized.g());
        boolean zE = ((DynamicDocumentData) pq.v.l0(initialized.g())).getStatus().e();
        b0 mainDocumentPhoto = initialized.getMainDocumentPhoto();
        b0 mainDocumentPesel = initialized.getMainDocumentPesel();
        er.a<i0> aVarA = params.a();
        er.a<i0> aVarI = params.i();
        er.a<i0> aVarF = params.f();
        er.a<i0> aVarP = params.p();
        er.a<i0> aVarB = params.b();
        er.a<i0> aVarG = params.g();
        l<DocumentActionAttribute.a, i0> lVarJ = params.j();
        l<String, i0> lVarK = params.k();
        er.a<i0> aVarC = params.c();
        l<n20.a, i0> lVarD = params.d();
        l<DynamicDocumentBottomSheetData, i0> lVarL = params.l();
        er.a<i0> aVarH = params.h();
        return new gw1.d.a.b.SingleDocument(fVar.b(new vv1.f.Params(stateM, initialized.getDocumentShortName(), dynamicDocumentData, zE, mainDocumentPhoto, mainDocumentPesel, params.getDocumentVMS(), initialized.getBitmapsByFieldReference(), aVarA, aVarI, aVarF, aVarP, aVarB, aVarG, lVarJ, lVarK, lVarL, aVarH, aVarC, lVarD)), i(initialized.getDocumentShortName(), ((DynamicDocumentData) pq.v.l0(initialized.g())).getSchema(), params.a(), params.h()), m(initialized.getOpenedTab(), initialized.getMultiDocumentSchema(), params.n()), params.a(), params.i(), new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, new l() { // from class: hw1.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.E(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(dv1.a.f44623a), null, null, 12, null), initialized.getBottomSheetContentData());
    }
}
