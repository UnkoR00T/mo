package k21;

import fr.t;
import iq0.TemporaryInterruption;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\u000b\f\r\u000eB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lk21/o;", "", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Ler/a;)V", "a", "Ler/a;", "getOnCloseAction", "()Ler/a;", "b", "c", "e", "d", "Lk21/o$a;", "Lk21/o$b;", "Lk21/o$c;", "Lk21/o$d;", "Lk21/o$e;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onCloseAction;

    /* JADX INFO: renamed from: k21.o$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lk21/o$a;", "Lk21/o;", "Lkotlin/Function0;", "Loq/i0;", "onExitChatAction", "onCloseAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "()Ler/a;", "c", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExitDialog extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitChatAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public ExitDialog(er.a<i0> aVar, er.a<i0> aVar2) {
            super(aVar2, null);
            this.onExitChatAction = aVar;
            this.onCloseAction = aVar2;
        }

        public er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.onExitChatAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExitDialog)) {
                return false;
            }
            ExitDialog exitDialog = (ExitDialog) other;
            return t.c(this.onExitChatAction, exitDialog.onExitChatAction) && t.c(this.onCloseAction, exitDialog.onCloseAction);
        }

        public int hashCode() {
            return (this.onExitChatAction.hashCode() * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "ExitDialog(onExitChatAction=" + this.onExitChatAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: k21.o$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lk21/o$b;", "Lk21/o;", "Lkotlin/Function0;", "Loq/i0;", "openNewChatAction", "onCloseAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "()Ler/a;", "c", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenNewChatDialog extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openNewChatAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public OpenNewChatDialog(er.a<i0> aVar, er.a<i0> aVar2) {
            super(aVar2, null);
            this.openNewChatAction = aVar;
            this.onCloseAction = aVar2;
        }

        public er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.openNewChatAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenNewChatDialog)) {
                return false;
            }
            OpenNewChatDialog openNewChatDialog = (OpenNewChatDialog) other;
            return t.c(this.openNewChatAction, openNewChatDialog.openNewChatAction) && t.c(this.onCloseAction, openNewChatDialog.onCloseAction);
        }

        public int hashCode() {
            return (this.openNewChatAction.hashCode() * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "OpenNewChatDialog(openNewChatAction=" + this.openNewChatAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: k21.o$c, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk21/o$c;", "Lk21/o;", "", "titleStringResId", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(ILer/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ler/a;", "a", "()Ler/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalDataFoundDialog extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleStringResId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public PersonalDataFoundDialog(int i15, er.a<i0> aVar) {
            super(aVar, null);
            this.titleStringResId = i15;
            this.onCloseAction = aVar;
        }

        public er.a<i0> a() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTitleStringResId() {
            return this.titleStringResId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalDataFoundDialog)) {
                return false;
            }
            PersonalDataFoundDialog personalDataFoundDialog = (PersonalDataFoundDialog) other;
            return this.titleStringResId == personalDataFoundDialog.titleStringResId && t.c(this.onCloseAction, personalDataFoundDialog.onCloseAction);
        }

        public int hashCode() {
            return (Integer.hashCode(this.titleStringResId) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "PersonalDataFoundDialog(titleStringResId=" + this.titleStringResId + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: k21.o$d, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lk21/o$d;", "Lk21/o;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "redirectAction", "Ll21/a;", "type", "<init>", "(Ler/a;Ler/a;Ll21/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "c", "d", "Ll21/a;", "()Ll21/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedirectDialog extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> redirectAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l21.a type;

        public RedirectDialog(er.a<i0> aVar, er.a<i0> aVar2, l21.a aVar3) {
            super(aVar, null);
            this.onCloseAction = aVar;
            this.redirectAction = aVar2;
            this.type = aVar3;
        }

        public er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.redirectAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final l21.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedirectDialog)) {
                return false;
            }
            RedirectDialog redirectDialog = (RedirectDialog) other;
            return t.c(this.onCloseAction, redirectDialog.onCloseAction) && t.c(this.redirectAction, redirectDialog.redirectAction) && t.c(this.type, redirectDialog.type);
        }

        public int hashCode() {
            return (((this.onCloseAction.hashCode() * 31) + this.redirectAction.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "RedirectDialog(onCloseAction=" + this.onCloseAction + ", redirectAction=" + this.redirectAction + ", type=" + this.type + ')';
        }
    }

    /* JADX INFO: renamed from: k21.o$e, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk21/o$e;", "Lk21/o;", "Liq0/g0;", "data", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Liq0/g0;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Liq0/g0;", "a", "()Liq0/g0;", "c", "Ler/a;", "()Ler/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemporaryInterruptionDialog extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TemporaryInterruption data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public TemporaryInterruptionDialog(TemporaryInterruption temporaryInterruption, er.a<i0> aVar) {
            super(aVar, null);
            this.data = temporaryInterruption;
            this.onCloseAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TemporaryInterruption getData() {
            return this.data;
        }

        public er.a<i0> b() {
            return this.onCloseAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemporaryInterruptionDialog)) {
                return false;
            }
            TemporaryInterruptionDialog temporaryInterruptionDialog = (TemporaryInterruptionDialog) other;
            return t.c(this.data, temporaryInterruptionDialog.data) && t.c(this.onCloseAction, temporaryInterruptionDialog.onCloseAction);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "TemporaryInterruptionDialog(data=" + this.data + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    public /* synthetic */ o(er.a aVar, fr.k kVar) {
        this(aVar);
    }

    private o(er.a<i0> aVar) {
        this.onCloseAction = aVar;
    }
}
