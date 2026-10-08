package kh1;

import androidx.compose.ui.graphics.Color;
import c40.DocumentRowData;
import er.p;
import fr.t;
import fr0.BEDocumentConfigLabel;
import fr0.DocumentConfig;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh1.v;
import jh1.w;
import lh1.DocumentsEmptyScreenData;
import lh1.DocumentsListScreenModel;
import lr.m;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v0;
import r70.BaseFloatingActionButtonData;
import s20.DocumentRefreshCardData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJY\u0010%\u001a\u00020$*\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\r0\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u00020**\u00020\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u0004\u0018\u00010**\u00020\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b-\u0010,J\u001b\u00100\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u0004\u0018\u0001022\b\u0010.\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lkh1/e;", "Lxw/f;", "Lkh1/e$a;", "Ljh1/w$a;", "Lmx/c;", "labelProvider", "Lr34/a;", "getDocumentConfigLabelUC", "<init>", "(Lmx/c;Lr34/a;)V", "", "hasAnyNotDisplayedPush", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lx50/a$c;", "G", "(ZLer/a;)Lx50/a$c;", "params", "Llh1/b;", "E", "(Lkh1/e$a;)Llh1/b;", "onAddDocumentButtonClick", "", "Lr70/a;", "r", "(Ler/a;)Ljava/util/List;", "Lk34/g;", "Ljh1/v$c;", "state", "Lkotlin/Function2;", "Lrq0/b;", "Llz3/h;", "onDocumentClick", "onAnimationPlayedAction", "changeBigCardsStateAction", "Llh1/c;", "u", "(Ljava/util/List;Ljh1/v$c;Ler/p;Ler/a;Ler/a;)Llh1/c;", "", "Lfr0/g;", "documentsConfig", "Lmx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lk34/g;Ljava/util/Map;)Lmx/a;", "l", "status", "Lr50/a$b;", "m", "(Llz3/h;)Lr50/a$b;", "Ls20/d;", "q", "(Llz3/h;)Ls20/d;", "s", "(Lkh1/e$a;)Ljh1/w$a;", "a", "Lmx/c;", "b", "Lr34/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<DocumentsParams, w.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r34.a getDocumentConfigLabelUC;

    /* JADX INFO: renamed from: kh1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b\u001e\u0010%R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b-\u0010%¨\u0006."}, d2 = {"Lkh1/e$a;", "", "Ljh1/v;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNotificationsClick", "onChatBotIconClick", "onElectronicDeliveryIconClick", "Lkotlin/Function2;", "Lrq0/b;", "Llz3/h;", "onDocumentClick", "onConfigButtonClick", "onAddDocumentButtonClick", "onAnimationPlayedAction", "changeBigCardsStateAction", "onStudentCardAlertClose", "<init>", "(Ljh1/v;Ler/a;Ler/a;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljh1/v;", "j", "()Ljh1/v;", "b", "Ler/a;", "h", "()Ler/a;", "c", "d", "g", "e", "Ler/p;", "f", "()Ler/p;", "i", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNotificationsClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChatBotIconClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onElectronicDeliveryIconClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<rq0.b, lz3.h, i0> onDocumentClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfigButtonClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddDocumentButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAnimationPlayedAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changeBigCardsStateAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onStudentCardAlertClose;

        /* JADX WARN: Multi-variable type inference failed */
        public DocumentsParams(v vVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, p<? super rq0.b, ? super lz3.h, i0> pVar, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, er.a<i0> aVar8) {
            this.state = vVar;
            this.onNotificationsClick = aVar;
            this.onChatBotIconClick = aVar2;
            this.onElectronicDeliveryIconClick = aVar3;
            this.onDocumentClick = pVar;
            this.onConfigButtonClick = aVar4;
            this.onAddDocumentButtonClick = aVar5;
            this.onAnimationPlayedAction = aVar6;
            this.changeBigCardsStateAction = aVar7;
            this.onStudentCardAlertClose = aVar8;
        }

        public final er.a<i0> a() {
            return this.changeBigCardsStateAction;
        }

        public final er.a<i0> b() {
            return this.onAddDocumentButtonClick;
        }

        public final er.a<i0> c() {
            return this.onAnimationPlayedAction;
        }

        public final er.a<i0> d() {
            return this.onChatBotIconClick;
        }

        public final er.a<i0> e() {
            return this.onConfigButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentsParams)) {
                return false;
            }
            DocumentsParams documentsParams = (DocumentsParams) other;
            return t.c(this.state, documentsParams.state) && t.c(this.onNotificationsClick, documentsParams.onNotificationsClick) && t.c(this.onChatBotIconClick, documentsParams.onChatBotIconClick) && t.c(this.onElectronicDeliveryIconClick, documentsParams.onElectronicDeliveryIconClick) && t.c(this.onDocumentClick, documentsParams.onDocumentClick) && t.c(this.onConfigButtonClick, documentsParams.onConfigButtonClick) && t.c(this.onAddDocumentButtonClick, documentsParams.onAddDocumentButtonClick) && t.c(this.onAnimationPlayedAction, documentsParams.onAnimationPlayedAction) && t.c(this.changeBigCardsStateAction, documentsParams.changeBigCardsStateAction) && t.c(this.onStudentCardAlertClose, documentsParams.onStudentCardAlertClose);
        }

        public final p<rq0.b, lz3.h, i0> f() {
            return this.onDocumentClick;
        }

        public final er.a<i0> g() {
            return this.onElectronicDeliveryIconClick;
        }

        public final er.a<i0> h() {
            return this.onNotificationsClick;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onNotificationsClick.hashCode()) * 31) + this.onChatBotIconClick.hashCode()) * 31) + this.onElectronicDeliveryIconClick.hashCode()) * 31) + this.onDocumentClick.hashCode()) * 31) + this.onConfigButtonClick.hashCode()) * 31) + this.onAddDocumentButtonClick.hashCode()) * 31) + this.onAnimationPlayedAction.hashCode()) * 31) + this.changeBigCardsStateAction.hashCode()) * 31) + this.onStudentCardAlertClose.hashCode();
        }

        public final er.a<i0> i() {
            return this.onStudentCardAlertClose;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final v getState() {
            return this.state;
        }

        public String toString() {
            return "DocumentsParams(state=" + this.state + ", onNotificationsClick=" + this.onNotificationsClick + ", onChatBotIconClick=" + this.onChatBotIconClick + ", onElectronicDeliveryIconClick=" + this.onElectronicDeliveryIconClick + ", onDocumentClick=" + this.onDocumentClick + ", onConfigButtonClick=" + this.onConfigButtonClick + ", onAddDocumentButtonClick=" + this.onAddDocumentButtonClick + ", onAnimationPlayedAction=" + this.onAnimationPlayedAction + ", changeBigCardsStateAction=" + this.changeBigCardsStateAction + ", onStudentCardAlertClose=" + this.onStudentCardAlertClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f111057b;

        static {
            int[] iArr = new int[ah1.b.values().length];
            try {
                iArr[ah1.b.BigCards.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah1.b.SmallCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ah1.b.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f111056a = iArr;
            int[] iArr2 = new int[lz3.h.values().length];
            try {
                iArr2[lz3.h.REVOKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[lz3.h.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lz3.h.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[lz3.h.TAKES_TOO_LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[lz3.h.VALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f111057b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kh1/e$c", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.S0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        c(e eVar) {
            this.contentDescription = eVar.labelProvider.c(sg1.a.f181452b0);
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kh1/e$d", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        d(e eVar) {
            ah1.a.EnumC0131a enumC0131a = ah1.a.EnumC0131a.EDOR;
            this.iconResId = enumC0131a.getIcon();
            this.contentDescription = eVar.labelProvider.c(enumC0131a.getTitle());
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    /* JADX INFO: renamed from: kh1.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2670e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2670e f111062a = new C2670e();

        C2670e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-789824359);
            if (p076m2.t.k()) {
                p076m2.t.o(-789824359, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.mappers.DocumentsListMapper.invoke.<anonymous> (DocumentsListMapper.kt:127)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f111063a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-16782408);
            if (p076m2.t.k()) {
                p076m2.t.o(-16782408, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.mappers.DocumentsListMapper.invoke.<anonymous> (DocumentsListMapper.kt:128)");
            }
            long jA = ((gh1.a) rVar.N(gh1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kh1/e$g", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106798j0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        g(e eVar) {
            this.contentDescription = eVar.labelProvider.c(ah1.a.EnumC0131a.NOTIFICATIONS.getTitle());
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f111066a = new h();

        h() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(15471996);
            if (p076m2.t.k()) {
                p076m2.t.o(15471996, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.mappers.DocumentsListMapper.provideNotificationsMenuButton.<anonymous> (DocumentsListMapper.kt:161)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kh1/e$i", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106736b0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        i(e eVar) {
            this.contentDescription = eVar.labelProvider.c(sg1.a.f181492l0);
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    public e(mx.c cVar, r34.a aVar) {
        this.labelProvider = cVar;
        this.getDocumentConfigLabelUC = aVar;
    }

    private final DocumentsEmptyScreenData E(DocumentsParams params) {
        return new DocumentsEmptyScreenData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: kh1.d
            @Override // er.a
            public final Object a() {
                return e.F();
            }
        }), this.labelProvider.c(sg1.a.H0), null, null, null, 28, null), r(params.b()), null, null, null, 57, null), this.labelProvider.c(sg1.a.G0), this.labelProvider.c(sg1.a.F0), this.labelProvider.c(sg1.a.E0), this.labelProvider.c(sg1.a.D0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F() {
        return i0.f148189a;
    }

    private final x50.a.MenuButtonData G(boolean hasAnyNotDisplayedPush, er.a<i0> onClick) {
        if (hasAnyNotDisplayedPush) {
            return new x50.a.MenuButtonData(new g(this), h.f111066a, null, onClick, 4, null);
        }
        if (hasAnyNotDisplayedPush) {
            throw new oq.p();
        }
        return new x50.a.MenuButtonData(new i(this), null, null, onClick, 6, null);
    }

    private final Label H(k34.g gVar, Map<rq0.b, DocumentConfig> map) {
        List<BEDocumentConfigLabel> listG;
        DocumentConfig documentConfig = map.get(gVar.getType());
        if (documentConfig != null && (listG = documentConfig.g()) != null) {
            String strA = this.getDocumentConfigLabelUC.a(new r34.a.Params(listG));
            Label labelB = strA != null ? mx.b.b(strA, "title") : null;
            if (labelB != null) {
                return labelB;
            }
        }
        mx.c cVar = this.labelProvider;
        Integer nameAlternative = gVar.getNameAlternative();
        return cVar.c(nameAlternative != null ? nameAlternative.intValue() : gVar.getName());
    }

    private final Label l(k34.g gVar, Map<rq0.b, DocumentConfig> map) {
        List<BEDocumentConfigLabel> listA;
        DocumentConfig documentConfig = map.get(gVar.getType());
        if (documentConfig != null && (listA = documentConfig.a()) != null) {
            String strA = this.getDocumentConfigLabelUC.a(new r34.a.Params(listA));
            Label labelB = strA != null ? mx.b.b(strA, "description") : null;
            if (labelB != null) {
                return labelB;
            }
        }
        Integer description = gVar.getDescription();
        if (description != null) {
            return this.labelProvider.c(description.intValue());
        }
        return null;
    }

    private final r50.a.WithIcon m(lz3.h status) {
        int i15 = status == null ? -1 : b.f111057b[status.ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(sg1.a.f181472g0), null, 0, false, r50.g.NOTICE, 13, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, this.labelProvider.c(sg1.a.f181460d0), null, 0, false, r50.g.NEGATIVE, 13, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, this.labelProvider.c(sg1.a.f181464e0), null, 0, false, r50.g.NOTICE, 13, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, this.labelProvider.c(sg1.a.f181456c0), null, 0, false, r50.g.POSITIVE, 13, null);
        }
        if (i15 != 5) {
            return null;
        }
        return new r50.a.WithIcon(null, this.labelProvider.c(sg1.a.f181468f0), null, 0, false, r50.g.NOTICE, 13, null);
    }

    private final s20.d q(lz3.h status) {
        switch (status == null ? -1 : b.f111057b[status.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new oq.p();
            case 1:
                return new s20.d.Notice(this.labelProvider.c(sg1.a.f181472g0));
            case 2:
                return new s20.d.XMark(this.labelProvider.c(sg1.a.f181460d0));
            case 3:
                return new s20.d.Notice(this.labelProvider.c(sg1.a.f181464e0));
            case 4:
                return new s20.d.CheckMark(this.labelProvider.c(sg1.a.f181456c0));
            case 5:
                return new s20.d.Notice(this.labelProvider.c(sg1.a.f181468f0));
            case 6:
                return null;
        }
    }

    private final List<BaseFloatingActionButtonData> r(er.a<i0> onAddDocumentButtonClick) {
        return pq.v.e(new BaseFloatingActionButtonData(jz.a.f106760e0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(sg1.a.f181520u)), onAddDocumentButtonClick));
    }

    private final lh1.c u(List<? extends k34.g> list, v.Initialized initialized, final p<? super rq0.b, ? super lz3.h, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2) {
        int i15 = b.f111056a[initialized.getDocumentsLayoutType().ordinal()];
        if (i15 == 1) {
            List<? extends k34.g> list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(pq.v.y(list2, 10)), 16));
            for (Object obj : list2) {
                linkedHashMap.put(obj, initialized.g().get(((k34.g) obj).getType()));
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                final k34.g gVar = (k34.g) entry.getKey();
                final lz3.h hVar = (lz3.h) entry.getValue();
                arrayList.add(new DocumentRefreshCardData(fh1.a.a(gVar.getType()), H(gVar, initialized.e()), null, Label.INSTANCE.c(), q(hVar), new er.a() { // from class: kh1.a
                    @Override // er.a
                    public final Object a() {
                        return e.v(pVar, gVar, hVar);
                    }
                }, null, gVar.getType().getReferenceName() + "BigCards", 68, null));
            }
            return new lh1.c.BIG(arrayList, initialized.getShouldPlayEnterAnimation(), aVar, initialized.getBigCardsState(), aVar2);
        }
        if (i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            List<? extends k34.g> list3 = list;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m.e(v0.e(pq.v.y(list3, 10)), 16));
            for (Object obj2 : list3) {
                linkedHashMap2.put(obj2, initialized.g().get(((k34.g) obj2).getType()));
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                final k34.g gVar2 = (k34.g) entry2.getKey();
                final lz3.h hVar2 = (lz3.h) entry2.getValue();
                arrayList2.add(new DocumentRowData(null, gVar2.getIcons().getIcon(), H(gVar2, initialized.e()), l(gVar2, initialized.e()), null, m(hVar2), new er.a() { // from class: kh1.c
                    @Override // er.a
                    public final Object a() {
                        return e.z(pVar, gVar2, hVar2);
                    }
                }, 17, null));
            }
            return new lh1.c.LIST(arrayList2);
        }
        List<? extends k34.g> list4 = list;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m.e(v0.e(pq.v.y(list4, 10)), 16));
        for (Object obj3 : list4) {
            linkedHashMap3.put(obj3, initialized.g().get(((k34.g) obj3).getType()));
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap3.size());
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            final k34.g gVar3 = (k34.g) entry3.getKey();
            final lz3.h hVar3 = (lz3.h) entry3.getValue();
            arrayList3.add(new DocumentRefreshCardData(fh1.a.a(gVar3.getType()), H(gVar3, initialized.e()), null, Label.INSTANCE.c(), q(hVar3), new er.a() { // from class: kh1.b
                @Override // er.a
                public final Object a() {
                    return e.x(pVar, gVar3, hVar3);
                }
            }, null, gVar3.getType().getReferenceName() + "SmallCard", 68, null));
        }
        return new lh1.c.SMALL(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(p pVar, k34.g gVar, lz3.h hVar) {
        pVar.B(gVar.getType(), hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(p pVar, k34.g gVar, lz3.h hVar) {
        pVar.B(gVar.getType(), hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(p pVar, k34.g gVar, lz3.h hVar) {
        pVar.B(gVar.getType(), hVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public w.a b(DocumentsParams params) {
        c30.b.a aVar;
        Label labelC;
        v state = params.getState();
        if (state instanceof v.Initial) {
            return w.a.b.f102996a;
        }
        if (state instanceof v.Empty) {
            return new w.a.Empty(E(params));
        }
        if (!(state instanceof v.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData.EnumC2111a enumC2111a = BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll;
        Label labelC2 = this.labelProvider.c(sg1.a.H0);
        x50.a.MenuButtonData menuButtonData = new x50.a.MenuButtonData(new c(this), null, null, params.d(), 6, null);
        if (!((v.Initialized) params.getState()).getIsChatBotEnabled()) {
            menuButtonData = null;
        }
        x50.a.MenuButtonData menuButtonData2 = new x50.a.MenuButtonData(new d(this), null, null, params.g(), 6, null);
        if (!((v.Initialized) params.getState()).getIsElectronicDeliveryEnabled()) {
            menuButtonData2 = null;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(enumC2111a, new x50.i.Medium(null, labelC2, null, new x50.a.IconList(pq.v.s(menuButtonData, menuButtonData2, G(((v.Initialized) params.getState()).getHasAnyNotDisplayedPush(), params.h()))), true, null, 37, null), r(params.b()), null, null, null, 56, null);
        lh1.c cVarU = u(((v.Initialized) params.getState()).d(), (v.Initialized) params.getState(), params.f(), params.c(), params.a());
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(sg1.a.C0).n("DocumentsMainScreenCustomizeButtonText"), null, null, params.e(), 13, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(sg1.a.B0), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        er.a<i0> aVarE = params.e();
        boolean layoutChanged = ((v.Initialized) params.getState()).getLayoutChanged();
        boolean shouldPlayEnterAnimation = ((v.Initialized) params.getState()).getShouldPlayEnterAnimation();
        er.a<i0> aVarC = params.c();
        if (((v.Initialized) params.getState()).getStudentCardExpirationAlert() instanceof ah1.i.b) {
            int i15 = jz.a.Q2;
            C2670e c2670e = C2670e.f111062a;
            f fVar = f.f111063a;
            Label labelC3 = this.labelProvider.c(sg1.a.f181484j0);
            ah1.i.b bVar = (ah1.i.b) ((v.Initialized) params.getState()).getStudentCardExpirationAlert();
            if (bVar instanceof ah1.i.b.In) {
                labelC = this.labelProvider.e(sg1.a.f181476h0, Long.valueOf(((ah1.i.b.In) ((v.Initialized) params.getState()).getStudentCardExpirationAlert()).getDays()));
            } else {
                if (!t.c(bVar, ah1.i.b.C0132b.f6360a)) {
                    throw new oq.p();
                }
                labelC = this.labelProvider.c(sg1.a.f181480i0);
            }
            aVar = new c30.b.a(i15, c2670e, fVar, null, "StudentCardAlert", labelC3, labelC, params.i(), null, null, 776, null);
        } else {
            aVar = null;
        }
        return new w.a.Initialized(new DocumentsListScreenModel(baseScaffoldData, aVar, cVarU, buttonTextData, buttonData, aVarE, layoutChanged, shouldPlayEnterAnimation, aVarC));
    }
}
