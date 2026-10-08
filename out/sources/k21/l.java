package k21;

import er.q;
import fr.t;
import g21.Action;
import g21.ConversationData;
import g21.Source;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j21.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p30.ClickableContent;
import p30.FooterData;
import p30.SourcesData;
import p30.x;
import pq.v;
import t50.TextAreaData;
import t50.s;
import x50.NavigationButtonData;
import y40.MenuData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002,*B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JË\u0001\u0010 \u001a\u00020\u001f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000e2\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b \u0010!JI\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#*\u00020\u00152\u0006\u0010\"\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u00100\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u00020\t*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lk21/l;", "Lxw/f;", "Lk21/l$b;", "Lj21/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lj21/h1;", "", "index", "messagesCount", "Lg21/b;", "conversationData", "Lkotlin/Function1;", "", "Loq/i0;", "onSuggestionClick", "Liy/b0;", "onShowRedirectDialog", "Lkotlin/Function3;", "Lj21/h1$a$a;", "Lg21/e;", "onRateAnswerClick", "onShareAnswerClick", "Lg21/a;", "onActionClick", "Lkotlin/Function0;", "openNewChatAction", "onExitChat", "onSendQuestion", "Lp30/a;", "K", "(Lj21/h1;IILg21/b;Ler/l;Ler/l;Ler/q;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;)Lp30/a;", "rating", "", "Lp30/x;", "x", "(Lj21/h1$a$a;Lg21/e;Ler/l;Ler/l;)Ljava/util/List;", "params", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lk21/l$b;)Lj21/h$a;", "a", "Lmx/c;", "b", "Ljava/lang/String;", "getCheckedContentDescription", "()Ljava/lang/String;", "checkedContentDescription", "Lj21/g;", "G", "(Lj21/g;)I", "inputHintResId", "c", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, j21.h.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f107592c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f107593d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String checkedContentDescription;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lk21/l$a;", "", "<init>", "()V", "", "MAX_INPUT_LENGTH", "I", "MAX_INPUT_LINES", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k21.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B£\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b5\u00104R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b+\u0010.R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b/\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b7\u00104R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b:\u0010.R/\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00138\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b8\u0010=R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b>\u0010.R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b'\u0010.R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b6\u00104R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b1\u00104R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b;\u0010.¨\u0006?"}, d2 = {"Lk21/l$b;", "", "Lj21/g;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onUpdateTopBarMenu", "", "onInputContentChanged", "Lkotlin/Function0;", "onOpenNewChatDialog", "onGoToFaqButtonClick", "onCharsLimitReached", "onCloseButtonClick", "onSendButtonClick", "onSuggestionClick", "Liy/b0;", "onShowRedirectDialog", "Lkotlin/Function3;", "Lj21/h1$a$a;", "Lg21/e;", "onRateAnswerClick", "onShareAnswerClick", "Lg21/a;", "onActionClick", "onOpenNewChat", "onExitChat", "onSendQuestion", "<init>", "(Lj21/g;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;Ler/q;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lj21/g;", "p", "()Lj21/g;", "b", "Ler/l;", "o", "()Ler/l;", "c", "f", "d", "Ler/a;", "h", "()Ler/a;", "e", "g", "j", "i", "n", "m", "k", "Ler/q;", "()Ler/q;", "l", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j21.g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onUpdateTopBarMenu;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onInputContentChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenNewChatDialog;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToFaqButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCharsLimitReached;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendButtonClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onSuggestionClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onShowRedirectDialog;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<h1.a.Full, g21.e, String, i0> onRateAnswerClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onShareAnswerClick;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Action, i0> onActionClick;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenNewChat;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitChat;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onSendQuestion;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j21.g gVar, er.l<? super Boolean, i0> lVar, er.l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super Boolean, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super String, i0> lVar4, er.l<? super b0, i0> lVar5, q<? super h1.a.Full, ? super g21.e, ? super String, i0> qVar, er.l<? super String, i0> lVar6, er.l<? super Action, i0> lVar7, er.a<i0> aVar5, er.a<i0> aVar6, er.l<? super String, i0> lVar8) {
            this.state = gVar;
            this.onUpdateTopBarMenu = lVar;
            this.onInputContentChanged = lVar2;
            this.onOpenNewChatDialog = aVar;
            this.onGoToFaqButtonClick = aVar2;
            this.onCharsLimitReached = lVar3;
            this.onCloseButtonClick = aVar3;
            this.onSendButtonClick = aVar4;
            this.onSuggestionClick = lVar4;
            this.onShowRedirectDialog = lVar5;
            this.onRateAnswerClick = qVar;
            this.onShareAnswerClick = lVar6;
            this.onActionClick = lVar7;
            this.onOpenNewChat = aVar5;
            this.onExitChat = aVar6;
            this.onSendQuestion = lVar8;
        }

        public final er.l<Action, i0> a() {
            return this.onActionClick;
        }

        public final er.l<Boolean, i0> b() {
            return this.onCharsLimitReached;
        }

        public final er.a<i0> c() {
            return this.onCloseButtonClick;
        }

        public final er.a<i0> d() {
            return this.onExitChat;
        }

        public final er.a<i0> e() {
            return this.onGoToFaqButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onUpdateTopBarMenu, params.onUpdateTopBarMenu) && t.c(this.onInputContentChanged, params.onInputContentChanged) && t.c(this.onOpenNewChatDialog, params.onOpenNewChatDialog) && t.c(this.onGoToFaqButtonClick, params.onGoToFaqButtonClick) && t.c(this.onCharsLimitReached, params.onCharsLimitReached) && t.c(this.onCloseButtonClick, params.onCloseButtonClick) && t.c(this.onSendButtonClick, params.onSendButtonClick) && t.c(this.onSuggestionClick, params.onSuggestionClick) && t.c(this.onShowRedirectDialog, params.onShowRedirectDialog) && t.c(this.onRateAnswerClick, params.onRateAnswerClick) && t.c(this.onShareAnswerClick, params.onShareAnswerClick) && t.c(this.onActionClick, params.onActionClick) && t.c(this.onOpenNewChat, params.onOpenNewChat) && t.c(this.onExitChat, params.onExitChat) && t.c(this.onSendQuestion, params.onSendQuestion);
        }

        public final er.l<String, i0> f() {
            return this.onInputContentChanged;
        }

        public final er.a<i0> g() {
            return this.onOpenNewChat;
        }

        public final er.a<i0> h() {
            return this.onOpenNewChatDialog;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.state.hashCode() * 31) + this.onUpdateTopBarMenu.hashCode()) * 31) + this.onInputContentChanged.hashCode()) * 31) + this.onOpenNewChatDialog.hashCode()) * 31) + this.onGoToFaqButtonClick.hashCode()) * 31) + this.onCharsLimitReached.hashCode()) * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.onSendButtonClick.hashCode()) * 31) + this.onSuggestionClick.hashCode()) * 31) + this.onShowRedirectDialog.hashCode()) * 31) + this.onRateAnswerClick.hashCode()) * 31) + this.onShareAnswerClick.hashCode()) * 31) + this.onActionClick.hashCode()) * 31) + this.onOpenNewChat.hashCode()) * 31) + this.onExitChat.hashCode()) * 31) + this.onSendQuestion.hashCode();
        }

        public final q<h1.a.Full, g21.e, String, i0> i() {
            return this.onRateAnswerClick;
        }

        public final er.a<i0> j() {
            return this.onSendButtonClick;
        }

        public final er.l<String, i0> k() {
            return this.onSendQuestion;
        }

        public final er.l<String, i0> l() {
            return this.onShareAnswerClick;
        }

        public final er.l<b0, i0> m() {
            return this.onShowRedirectDialog;
        }

        public final er.l<String, i0> n() {
            return this.onSuggestionClick;
        }

        public final er.l<Boolean, i0> o() {
            return this.onUpdateTopBarMenu;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final j21.g getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUpdateTopBarMenu=" + this.onUpdateTopBarMenu + ", onInputContentChanged=" + this.onInputContentChanged + ", onOpenNewChatDialog=" + this.onOpenNewChatDialog + ", onGoToFaqButtonClick=" + this.onGoToFaqButtonClick + ", onCharsLimitReached=" + this.onCharsLimitReached + ", onCloseButtonClick=" + this.onCloseButtonClick + ", onSendButtonClick=" + this.onSendButtonClick + ", onSuggestionClick=" + this.onSuggestionClick + ", onShowRedirectDialog=" + this.onShowRedirectDialog + ", onRateAnswerClick=" + this.onRateAnswerClick + ", onShareAnswerClick=" + this.onShareAnswerClick + ", onActionClick=" + this.onActionClick + ", onOpenNewChat=" + this.onOpenNewChat + ", onExitChat=" + this.onExitChat + ", onSendQuestion=" + this.onSendQuestion + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"k21/l$c", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106728a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        c(l lVar) {
            this.contentDescription = lVar.labelProvider.c(a21.a.f2100l0);
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

    public l(mx.c cVar) {
        this.labelProvider = cVar;
        this.checkedContentDescription = cVar.c(a21.a.f2077a).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(er.l lVar, boolean z15) {
        if (z15) {
            lVar.b(g21.e.NEGATIVE);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(er.l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    private final int G(j21.g gVar) {
        return ((gVar instanceof j21.g.a) && ((j21.g.a) gVar).getData().getLastMessageContainsSuggestion()) ? a21.a.f2085e : a21.a.f2087f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params) {
        params.o().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params) {
        params.o().b(Boolean.TRUE);
        return i0.f148189a;
    }

    private final p30.a K(h1 h1Var, int i15, int i16, ConversationData conversationData, final er.l<? super String, i0> lVar, final er.l<? super b0, i0> lVar2, final q<? super h1.a.Full, ? super g21.e, ? super String, i0> qVar, er.l<? super String, i0> lVar3, final er.l<? super Action, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, final er.l<? super String, i0> lVar5) {
        Label label;
        SourcesData sourcesData;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        final h1 h1Var2 = h1Var;
        if (t.c(h1Var2, h1.e.f98761a)) {
            return new p30.a.IncomingMessage(this.labelProvider.c(a21.a.f2082c0), new p30.a.IncomingMessage.InterfaceC3749a.WithAnimatedDots(this.labelProvider.c(a21.a.f2101m)), null, null, null, null, null, 124, null);
        }
        if (h1Var2 instanceof h1.c) {
            Label labelC = this.labelProvider.c(a21.a.f2082c0);
            p30.a.IncomingMessage.InterfaceC3749a.Static r15 = new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(conversationData.getStaticMessages().getWelcomeMessage(), "initialMessage"));
            if (i16 != 1) {
                h1Var2 = null;
            }
            if (((h1.c) h1Var2) != null) {
                List<String> listA = conversationData.getStaticMessages().a();
                arrayList3 = new ArrayList(v.y(listA, 10));
                for (final String str : listA) {
                    arrayList3.add(new ClickableContent(str, new er.a() { // from class: k21.a
                        @Override // er.a
                        public final Object a() {
                            return l.L(lVar, str);
                        }
                    }));
                }
            } else {
                arrayList3 = null;
            }
            return new p30.a.IncomingMessage(labelC, r15, null, null, null, arrayList3, null, 92, null);
        }
        if (h1Var2 instanceof h1.Question) {
            return new p30.a.OutgoingMessage(mx.b.b(((h1.Question) h1Var2).getMessage(), "question_" + i15));
        }
        if (h1Var2 instanceof h1.Error) {
            h1.Error error = (h1.Error) h1Var2;
            return new p30.a.IncomingMessage(this.labelProvider.c(a21.a.f2082c0), new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(error.getMessage(), "error_" + i15)), null, null, ((h1.Error) (error.getShowActionButton() ? h1Var2 : null)) != null ? v.e(new ClickableContent(this.labelProvider.c(a21.a.f2117u).getText(), new er.a() { // from class: k21.c
                @Override // er.a
                public final Object a() {
                    return l.O(lVar5, h1Var2);
                }
            })) : null, null, null, 108, null);
        }
        if (h1Var2 instanceof h1.LimitExceeded) {
            return new p30.a.IncomingMessage(this.labelProvider.c(a21.a.f2082c0), new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(((h1.LimitExceeded) h1Var2).getMessage(), "limitExceeded_" + i15)), null, null, v.q(new ClickableContent(this.labelProvider.c(a21.a.f2099l).getText(), aVar), new ClickableContent(this.labelProvider.c(a21.a.f2093i).getText(), aVar2)), null, null, 108, null);
        }
        if (h1Var2 instanceof h1.Warning) {
            return new p30.a.IncomingMessage(this.labelProvider.c(a21.a.f2082c0), new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(((h1.Warning) h1Var2).getMessage(), "warning_" + i15)), null, null, null, null, null, 124, null);
        }
        if (!(h1Var2 instanceof h1.a.Full)) {
            if (!(h1Var2 instanceof h1.a.Part)) {
                throw new oq.p();
            }
            return new p30.a.IncomingMessage(this.labelProvider.c(a21.a.f2082c0), new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(((h1.a.Part) h1Var2).getContent(), "partAnswer_" + i15)), null, null, null, null, null, 124, null);
        }
        Label labelC2 = this.labelProvider.c(a21.a.f2082c0);
        h1.a.Full full = (h1.a.Full) h1Var2;
        p30.a.IncomingMessage.InterfaceC3749a.Static r16 = new p30.a.IncomingMessage.InterfaceC3749a.Static(mx.b.b(full.getContent(), "fullAnswer_" + i15));
        boolean showMessageCount = full.getShowMessageCount();
        Boolean boolValueOf = Boolean.valueOf(showMessageCount);
        if (!showMessageCount) {
            boolValueOf = null;
        }
        Label labelC3 = boolValueOf != null ? this.labelProvider.c(a21.a.f2081c) : null;
        List<Source> listJ = full.j();
        if (listJ.isEmpty()) {
            listJ = null;
        }
        if (listJ != null) {
            Label labelC4 = this.labelProvider.c(a21.a.f2115t);
            Label labelE = this.labelProvider.e(a21.a.f2111r, Integer.valueOf(listJ.size() - 1));
            Label labelC5 = this.labelProvider.c(a21.a.f2113s);
            List<Source> list = listJ;
            ArrayList arrayList4 = new ArrayList(v.y(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                final Source source = (Source) it.next();
                arrayList4.add(new ClickableContent(source.getName(), new er.a() { // from class: k21.d
                    @Override // er.a
                    public final Object a() {
                        return l.P(lVar2, source);
                    }
                }));
                labelC2 = labelC2;
            }
            label = labelC2;
            sourcesData = new SourcesData(labelC4, labelE, labelC5, arrayList4);
        } else {
            label = labelC2;
            sourcesData = null;
        }
        FooterData footerData = new FooterData(sourcesData, x(full, full.getRating(), new er.l() { // from class: k21.e
            @Override // er.l
            public final Object b(Object obj) {
                return l.Q(qVar, h1Var2, this, (g21.e) obj);
            }
        }, lVar3));
        List<Action> listC = full.c();
        if (full.c().isEmpty()) {
            listC = null;
        }
        if (listC != null) {
            List<Action> list2 = listC;
            arrayList = new ArrayList(v.y(list2, 10));
            for (final Action action : list2) {
                arrayList.add(new ClickableContent(action.getName(), new er.a() { // from class: k21.f
                    @Override // er.a
                    public final Object a() {
                        return l.M(lVar4, action);
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        List<String> listK = full.k();
        if (i15 != i16 - 1 || full.k().isEmpty() || full.getCurrentMessages() == conversationData.getLimits().getMaxQuestions()) {
            listK = null;
        }
        if (listK != null) {
            List<String> list3 = listK;
            arrayList2 = new ArrayList(v.y(list3, 10));
            for (final String str2 : list3) {
                arrayList2.add(new ClickableContent(str2, new er.a() { // from class: k21.g
                    @Override // er.a
                    public final Object a() {
                        return l.N(lVar, str2);
                    }
                }));
            }
        } else {
            arrayList2 = null;
        }
        return new p30.a.IncomingMessage(label, r16, labelC3, footerData, arrayList, arrayList2, null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(er.l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(er.l lVar, Action action) {
        lVar.b(action);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(er.l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(er.l lVar, h1 h1Var) {
        lVar.b(((h1.Error) h1Var).getLastQuestion());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(er.l lVar, Source source) {
        lVar.b(c0.g(source.getUrl()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(q qVar, h1 h1Var, l lVar, g21.e eVar) {
        qVar.w(h1Var, eVar, lVar.checkedContentDescription);
        return i0.f148189a;
    }

    private final List<x> x(h1.a.Full full, g21.e eVar, final er.l<? super g21.e, i0> lVar, final er.l<? super String, i0> lVar2) {
        List listC = v.c();
        boolean showRating = full.getShowRating();
        Boolean boolValueOf = Boolean.valueOf(showRating);
        final String str = null;
        if (!showRating) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            listC.add(new x.b.PositiveRate(eVar == g21.e.POSITIVE, new er.l() { // from class: k21.h
                @Override // er.l
                public final Object b(Object obj) {
                    return l.z(lVar, ((Boolean) obj).booleanValue());
                }
            }));
            listC.add(new x.b.NegativeRate(eVar == g21.e.NEGATIVE, new er.l() { // from class: k21.i
                @Override // er.l
                public final Object b(Object obj) {
                    return l.E(lVar, ((Boolean) obj).booleanValue());
                }
            }));
        }
        String content = full.getContent();
        if (content.length() > 0 && full.getShowRating()) {
            str = content;
        }
        if (str != null) {
            listC.add(new x.Share(new er.a() { // from class: k21.j
                @Override // er.a
                public final Object a() {
                    return l.F(lVar2, str);
                }
            }));
        }
        return v.a(listC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(er.l lVar, boolean z15) {
        if (z15) {
            lVar.b(g21.e.POSITIVE);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public j21.h.Data b(Params params) {
        t50.e error;
        l lVar;
        BaseScaffoldData baseScaffoldData;
        Label label;
        int i15;
        boolean z15;
        List listE;
        k30.b bVar;
        cb4.i iVar;
        cb4.i vmsAdapter;
        j21.g.a.Data data;
        j21.g.a.Data data2;
        j21.g.a.Data data3;
        j21.g.a.Data data4;
        j21.g.a.Data data5;
        final Params params2 = params;
        NavigationButtonData navigationButtonData = new NavigationButtonData(new NavigationButtonData.a.Icon(jz.a.U, this.labelProvider.c(a21.a.f2125z)), params2.c());
        Label labelC = this.labelProvider.c(a21.a.f2082c0);
        c cVar = new c(this);
        j21.g state = params2.getState();
        Object obj = null;
        j21.g.a aVar = state instanceof j21.g.a ? (j21.g.a) state : null;
        boolean z16 = false;
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(navigationButtonData, labelC, null, new x50.a.Icon(new x50.a.MenuButtonData(cVar, null, new MenuData((aVar == null || (data5 = aVar.getData()) == null) ? false : data5.getIsMenuVisible(), new er.a() { // from class: k21.k
            @Override // er.a
            public final Object a() {
                return l.I(params2);
            }
        }, v.q(new y40.b(null, this.labelProvider.c(a21.a.f2099l), null, Integer.valueOf(jz.a.T0), params2.h(), 1, null), new y40.b(null, this.labelProvider.c(a21.a.M), null, Integer.valueOf(jz.a.f106752d0), params2.e(), 1, null))), new er.a() { // from class: k21.b
            @Override // er.a
            public final Object a() {
                return l.J(params2);
            }
        }, 2, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelB = mx.b.b(params2.getState().getStartConversationDateTime(), "startConversationDateTime");
        s.Flexible flexible = new s.Flexible(4);
        Label labelC2 = this.labelProvider.c(G(params2.getState()));
        j21.g state2 = params2.getState();
        j21.g.a aVar2 = state2 instanceof j21.g.a ? (j21.g.a) state2 : null;
        boolean isInputEnabled = (aVar2 == null || (data4 = aVar2.getData()) == null) ? false : data4.getIsInputEnabled();
        t50.a.Visible visible = new t50.a.Visible(500, params2.b());
        j21.g state3 = params2.getState();
        j21.g.a aVar3 = state3 instanceof j21.g.a ? (j21.g.a) state3 : null;
        Boolean boolValueOf = (aVar3 == null || (data3 = aVar3.getData()) == null) ? null : Boolean.valueOf(data3.getLimitReached());
        int i16 = 1;
        if (t.c(boolValueOf, Boolean.TRUE)) {
            error = new t50.e.Error(this.labelProvider.c(a21.a.f2089g));
        } else {
            if (!t.c(boolValueOf, Boolean.FALSE) && boolValueOf != null) {
                throw new oq.p();
            }
            error = new t50.e.Default(null, 1, null);
        }
        t50.e eVar = error;
        j21.g state4 = params2.getState();
        j21.g.a aVar4 = state4 instanceof j21.g.a ? (j21.g.a) state4 : null;
        String inputContent = (aVar4 == null || (data2 = aVar4.getData()) == null) ? null : data2.getInputContent();
        if (inputContent == null) {
            inputContent = "";
        }
        TextAreaData textAreaData = new TextAreaData(null, null, flexible, null, eVar, inputContent, isInputEnabled, visible, labelC2, 0, null, null, params2.f(), null, 11787, null);
        j21.g state5 = params2.getState();
        if (state5 instanceof j21.g.a) {
            List<h1> listD = ((j21.g.a) params2.getState()).getData().d();
            ArrayList arrayList = new ArrayList(v.y(listD, 10));
            ArrayList arrayList2 = arrayList;
            int i17 = 0;
            for (Object obj2 : listD) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(K((h1) obj2, i17, ((j21.g.a) params2.getState()).getData().d().size(), ((j21.g.a) params2.getState()).getData().getConversationData(), params2.n(), params2.m(), params2.i(), params2.l(), params2.a(), params2.g(), params2.d(), params2.k()));
                arrayList2 = arrayList3;
                i16 = i16;
                z16 = z16;
                i17 = i18;
                baseScaffoldData2 = baseScaffoldData2;
                labelB = labelB;
                obj = null;
                params2 = params;
            }
            lVar = this;
            baseScaffoldData = baseScaffoldData2;
            label = labelB;
            i15 = i16;
            z15 = z16;
            listE = v.S(arrayList2);
        } else {
            lVar = this;
            baseScaffoldData = baseScaffoldData2;
            label = labelB;
            i15 = 1;
            z15 = false;
            if (!(state5 instanceof j21.g.b)) {
                throw new oq.p();
            }
            listE = v.e(new p30.a.Loading(lVar.labelProvider.c(a21.a.f2082c0)));
        }
        List list = listE;
        er.a<i0> aVarC = params.c();
        k30.a.Large large = new k30.a.Large(z15, i15, null);
        k30.c.WithIcon withIcon = new k30.c.WithIcon(jz.a.U0, lVar.labelProvider.c(a21.a.f2091h));
        k30.d.a aVar5 = k30.d.a.f107773a;
        j21.g state6 = params.getState();
        j21.g.a aVar6 = state6 instanceof j21.g.a ? (j21.g.a) state6 : null;
        Boolean boolValueOf2 = (aVar6 == null || (data = aVar6.getData()) == null) ? null : Boolean.valueOf(data.getIsSendButtonEnabled());
        if (t.c(boolValueOf2, Boolean.TRUE)) {
            bVar = k30.b.c.f107768a;
        } else {
            if (!t.c(boolValueOf2, Boolean.FALSE) && boolValueOf2 != null) {
                throw new oq.p();
            }
            bVar = k30.b.C2562b.f107767a;
        }
        ButtonData buttonData = new ButtonData(null, null, large, withIcon, aVar5, bVar, params.j(), 3, null);
        boolean isDisclaimerEnabled = params.getState().getIsDisclaimerEnabled();
        Boolean boolValueOf3 = Boolean.valueOf(isDisclaimerEnabled);
        if (!isDisclaimerEnabled) {
            boolValueOf3 = null;
        }
        Label labelC3 = boolValueOf3 != null ? lVar.labelProvider.c(a21.a.f2080b0) : null;
        j21.g state7 = params.getState();
        if (!(state7 instanceof j21.g.a.Dialog)) {
            if (state7 instanceof j21.g.b.Dialog) {
                vmsAdapter = ((j21.g.b.Dialog) params.getState()).getVmsAdapter();
            } else {
                if (!(state7 instanceof j21.g.b.Screen) && !(state7 instanceof j21.g.a.Screen)) {
                    throw new oq.p();
                }
                iVar = null;
            }
            return new j21.h.Data(baseScaffoldData, label, textAreaData, list, aVarC, buttonData, labelC3, iVar);
        }
        vmsAdapter = ((j21.g.a.Dialog) params.getState()).getVmsAdapter();
        iVar = vmsAdapter;
        return new j21.h.Data(baseScaffoldData, label, textAreaData, list, aVarC, buttonData, labelC3, iVar);
    }
}
