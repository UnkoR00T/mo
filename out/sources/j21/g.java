package j21;

import g21.ConversationData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lj21/g;", "", "", "startConversationDateTime", "", "isDisclaimerEnabled", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Z", "()Z", "Lj21/g$a;", "Lj21/g$b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String startConversationDateTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDisclaimerEnabled;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lj21/g$a;", "Lj21/g;", "Lj21/g$a$a;", "data", "<init>", "(Lj21/g$a$a;)V", "c", "Lj21/g$a$a;", "()Lj21/g$a$a;", "a", "b", "Lj21/g$a$b;", "Lj21/g$a$c;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Data data;

        /* JADX INFO: renamed from: j21.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj21/g$a$b;", "Lj21/g$a;", "Lj21/g$a$a;", "data", "Lcb4/i;", "vmsAdapter", "<init>", "(Lj21/g$a$a;Lcb4/i;)V", "d", "(Lj21/g$a$a;Lcb4/i;)Lj21/g$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj21/g$a$a;", "c", "()Lj21/g$a$a;", "e", "Lcb4/i;", "f", "()Lcb4/i;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i vmsAdapter;

            public Dialog(Data data, cb4.i iVar) {
                super(data, null);
                this.data = data;
                this.vmsAdapter = iVar;
            }

            public static /* synthetic */ Dialog e(Dialog dialog, Data data, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    data = dialog.data;
                }
                if ((i15 & 2) != 0) {
                    iVar = dialog.vmsAdapter;
                }
                return dialog.d(data, iVar);
            }

            @Override // j21.g.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public Data getData() {
                return this.data;
            }

            public final Dialog d(Data data, cb4.i vmsAdapter) {
                return new Dialog(data, vmsAdapter);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.data, dialog.data) && fr.t.c(this.vmsAdapter, dialog.vmsAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final cb4.i getVmsAdapter() {
                return this.vmsAdapter;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(data=" + this.data + ", vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: j21.g$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj21/g$a$c;", "Lj21/g$a;", "Lj21/g$a$a;", "data", "<init>", "(Lj21/g$a$a;)V", "d", "(Lj21/g$a$a;)Lj21/g$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj21/g$a$a;", "c", "()Lj21/g$a$a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            public Screen(Data data) {
                super(data, null);
                this.data = data;
            }

            @Override // j21.g.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public Data getData() {
                return this.data;
            }

            public final Screen d(Data data) {
                return new Screen(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.data, ((Screen) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Screen(data=" + this.data + ')';
            }
        }

        public /* synthetic */ a(Data data, fr.k kVar) {
            this(data);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Data getData() {
            return this.data;
        }

        private a(Data data) {
            super(data.getStartConversationDateTime(), data.getIsDisclaimerEnabled(), null);
            this.data = data;
        }

        /* JADX INFO: renamed from: j21.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013Jz\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b/\u0010)R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b0\u0010)R\u0017\u00101\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b*\u0010)¨\u00062"}, d2 = {"Lj21/g$a$a;", "", "", "startConversationDateTime", "", "Lj21/h1;", "conversations", "Lg21/b;", "conversationData", "inputContent", "", "limitReached", "isInputEnabled", "", "lastMessageCount", "isSendButtonEnabled", "isMenuVisible", "isDisclaimerEnabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Lg21/b;Ljava/lang/String;ZZIZZZ)V", "a", "(Ljava/lang/String;Ljava/util/List;Lg21/b;Ljava/lang/String;ZZIZZZ)Lj21/g$a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lg21/b;", "()Lg21/b;", "e", "Z", "h", "()Z", "f", "k", "g", "I", "m", "l", "j", "lastMessageContainsSuggestion", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Data {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String startConversationDateTime;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<h1> conversations;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ConversationData conversationData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputContent;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean limitReached;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isInputEnabled;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final int lastMessageCount;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSendButtonEnabled;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isMenuVisible;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isDisclaimerEnabled;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            private final boolean lastMessageContainsSuggestion;

            /* JADX WARN: Multi-variable type inference failed */
            public Data(String str, List<? extends h1> list, ConversationData conversationData, String str2, boolean z15, boolean z16, int i15, boolean z17, boolean z18, boolean z19) {
                List<String> listK;
                this.startConversationDateTime = str;
                this.conversations = list;
                this.conversationData = conversationData;
                this.inputContent = str2;
                this.limitReached = z15;
                this.isInputEnabled = z16;
                this.lastMessageCount = i15;
                this.isSendButtonEnabled = z17;
                this.isMenuVisible = z18;
                this.isDisclaimerEnabled = z19;
                Object objZ0 = pq.v.z0(list);
                h1.a.Full full = objZ0 instanceof h1.a.Full ? (h1.a.Full) objZ0 : null;
                this.lastMessageContainsSuggestion = (full == null || (listK = full.k()) == null) ? false : !listK.isEmpty();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data b(Data data, String str, List list, ConversationData conversationData, String str2, boolean z15, boolean z16, int i15, boolean z17, boolean z18, boolean z19, int i16, Object obj) {
                if ((i16 & 1) != 0) {
                    str = data.startConversationDateTime;
                }
                if ((i16 & 2) != 0) {
                    list = data.conversations;
                }
                if ((i16 & 4) != 0) {
                    conversationData = data.conversationData;
                }
                if ((i16 & 8) != 0) {
                    str2 = data.inputContent;
                }
                if ((i16 & 16) != 0) {
                    z15 = data.limitReached;
                }
                if ((i16 & 32) != 0) {
                    z16 = data.isInputEnabled;
                }
                if ((i16 & 64) != 0) {
                    i15 = data.lastMessageCount;
                }
                if ((i16 & 128) != 0) {
                    z17 = data.isSendButtonEnabled;
                }
                if ((i16 & 256) != 0) {
                    z18 = data.isMenuVisible;
                }
                if ((i16 & 512) != 0) {
                    z19 = data.isDisclaimerEnabled;
                }
                boolean z25 = z18;
                boolean z26 = z19;
                int i17 = i15;
                boolean z27 = z17;
                boolean z28 = z15;
                boolean z29 = z16;
                return data.a(str, list, conversationData, str2, z28, z29, i17, z27, z25, z26);
            }

            public final Data a(String startConversationDateTime, List<? extends h1> conversations, ConversationData conversationData, String inputContent, boolean limitReached, boolean isInputEnabled, int lastMessageCount, boolean isSendButtonEnabled, boolean isMenuVisible, boolean isDisclaimerEnabled) {
                return new Data(startConversationDateTime, conversations, conversationData, inputContent, limitReached, isInputEnabled, lastMessageCount, isSendButtonEnabled, isMenuVisible, isDisclaimerEnabled);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ConversationData getConversationData() {
                return this.conversationData;
            }

            public final List<h1> d() {
                return this.conversations;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getInputContent() {
                return this.inputContent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return fr.t.c(this.startConversationDateTime, data.startConversationDateTime) && fr.t.c(this.conversations, data.conversations) && fr.t.c(this.conversationData, data.conversationData) && fr.t.c(this.inputContent, data.inputContent) && this.limitReached == data.limitReached && this.isInputEnabled == data.isInputEnabled && this.lastMessageCount == data.lastMessageCount && this.isSendButtonEnabled == data.isSendButtonEnabled && this.isMenuVisible == data.isMenuVisible && this.isDisclaimerEnabled == data.isDisclaimerEnabled;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getLastMessageContainsSuggestion() {
                return this.lastMessageContainsSuggestion;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final int getLastMessageCount() {
                return this.lastMessageCount;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getLimitReached() {
                return this.limitReached;
            }

            public int hashCode() {
                return (((((((((((((((((this.startConversationDateTime.hashCode() * 31) + this.conversations.hashCode()) * 31) + this.conversationData.hashCode()) * 31) + this.inputContent.hashCode()) * 31) + Boolean.hashCode(this.limitReached)) * 31) + Boolean.hashCode(this.isInputEnabled)) * 31) + Integer.hashCode(this.lastMessageCount)) * 31) + Boolean.hashCode(this.isSendButtonEnabled)) * 31) + Boolean.hashCode(this.isMenuVisible)) * 31) + Boolean.hashCode(this.isDisclaimerEnabled);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getStartConversationDateTime() {
                return this.startConversationDateTime;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getIsDisclaimerEnabled() {
                return this.isDisclaimerEnabled;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsInputEnabled() {
                return this.isInputEnabled;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getIsMenuVisible() {
                return this.isMenuVisible;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getIsSendButtonEnabled() {
                return this.isSendButtonEnabled;
            }

            public String toString() {
                return "Data(startConversationDateTime=" + this.startConversationDateTime + ", conversations=" + this.conversations + ", conversationData=" + this.conversationData + ", inputContent=" + this.inputContent + ", limitReached=" + this.limitReached + ", isInputEnabled=" + this.isInputEnabled + ", lastMessageCount=" + this.lastMessageCount + ", isSendButtonEnabled=" + this.isSendButtonEnabled + ", isMenuVisible=" + this.isMenuVisible + ", isDisclaimerEnabled=" + this.isDisclaimerEnabled + ')';
            }

            public /* synthetic */ Data(String str, List list, ConversationData conversationData, String str2, boolean z15, boolean z16, int i15, boolean z17, boolean z18, boolean z19, int i16, fr.k kVar) {
                this(str, list, conversationData, (i16 & 8) != 0 ? "" : str2, (i16 & 16) != 0 ? false : z15, (i16 & 32) != 0 ? true : z16, (i16 & 64) != 0 ? 0 : i15, (i16 & 128) != 0 ? false : z17, (i16 & 256) != 0 ? false : z18, z19);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj21/g$b;", "Lj21/g;", "", "startConversationDateTime", "", "isDisclaimerEnabled", "<init>", "(Ljava/lang/String;Z)V", "c", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "Z", "b", "()Z", "Lj21/g$b$a;", "Lj21/g$b$b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String startConversationDateTime;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isDisclaimerEnabled;

        /* JADX INFO: renamed from: j21.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lj21/g$b$a;", "Lj21/g$b;", "", "startConversationDateTime", "", "isDisclaimerEnabled", "Lcb4/i;", "vmsAdapter", "<init>", "(Ljava/lang/String;ZLcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "a", "f", "Z", "b", "()Z", "g", "Lcb4/i;", "c", "()Lcb4/i;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String startConversationDateTime;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isDisclaimerEnabled;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i vmsAdapter;

            public Dialog(String str, boolean z15, cb4.i iVar) {
                super(str, z15, null);
                this.startConversationDateTime = str;
                this.isDisclaimerEnabled = z15;
                this.vmsAdapter = iVar;
            }

            @Override // j21.g.b, j21.g
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getStartConversationDateTime() {
                return this.startConversationDateTime;
            }

            @Override // j21.g.b, j21.g
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsDisclaimerEnabled() {
                return this.isDisclaimerEnabled;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final cb4.i getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.startConversationDateTime, dialog.startConversationDateTime) && this.isDisclaimerEnabled == dialog.isDisclaimerEnabled && fr.t.c(this.vmsAdapter, dialog.vmsAdapter);
            }

            public int hashCode() {
                return (((this.startConversationDateTime.hashCode() * 31) + Boolean.hashCode(this.isDisclaimerEnabled)) * 31) + this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(startConversationDateTime=" + this.startConversationDateTime + ", isDisclaimerEnabled=" + this.isDisclaimerEnabled + ", vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: j21.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj21/g$b$b;", "Lj21/g$b;", "", "startConversationDateTime", "", "isDisclaimerEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "a", "f", "Z", "b", "()Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String startConversationDateTime;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isDisclaimerEnabled;

            public Screen(String str, boolean z15) {
                super(str, z15, null);
                this.startConversationDateTime = str;
                this.isDisclaimerEnabled = z15;
            }

            @Override // j21.g.b, j21.g
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getStartConversationDateTime() {
                return this.startConversationDateTime;
            }

            @Override // j21.g.b, j21.g
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsDisclaimerEnabled() {
                return this.isDisclaimerEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.startConversationDateTime, screen.startConversationDateTime) && this.isDisclaimerEnabled == screen.isDisclaimerEnabled;
            }

            public int hashCode() {
                return (this.startConversationDateTime.hashCode() * 31) + Boolean.hashCode(this.isDisclaimerEnabled);
            }

            public String toString() {
                return "Screen(startConversationDateTime=" + this.startConversationDateTime + ", isDisclaimerEnabled=" + this.isDisclaimerEnabled + ')';
            }
        }

        public /* synthetic */ b(String str, boolean z15, fr.k kVar) {
            this(str, z15);
        }

        @Override // j21.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getStartConversationDateTime() {
            return this.startConversationDateTime;
        }

        @Override // j21.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsDisclaimerEnabled() {
            return this.isDisclaimerEnabled;
        }

        private b(String str, boolean z15) {
            super(str, z15, null);
            this.startConversationDateTime = str;
            this.isDisclaimerEnabled = z15;
        }
    }

    public /* synthetic */ g(String str, boolean z15, fr.k kVar) {
        this(str, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getStartConversationDateTime() {
        return this.startConversationDateTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsDisclaimerEnabled() {
        return this.isDisclaimerEnabled;
    }

    private g(String str, boolean z15) {
        this.startConversationDateTime = str;
        this.isDisclaimerEnabled = z15;
    }
}
