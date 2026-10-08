package m12;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q12.MessageInitializedViewState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lm12/e;", "Ll00/e;", "Lm12/e$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lm12/e$a;", "", "c", "d", "a", "b", "Lm12/e$a$a;", "Lm12/e$a$b;", "Lm12/e$a$c;", "Lm12/e$a$d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: m12.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b#\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b\u001c\u0010+¨\u0006,"}, d2 = {"Lm12/e$a$a;", "Lm12/e$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerText", "", "Lm12/e$a$a$a;", "messageSections", "Lh30/a;", "editDraftButtonData", "deleteDraftButtonData", "Lkotlin/Function0;", "Loq/i0;", "backAction", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lh30/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "e", "()Lmx/a;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DraftMessage implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerText;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<MessageSection> messageSections;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData editDraftButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData deleteDraftButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> backAction;

            /* JADX INFO: renamed from: m12.e$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm12/e$a$a$a;", "", "Lmx/a;", "sectionTitle", "Ln30/b;", "cards", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MessageSection {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label sectionTitle;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData cards;

                public MessageSection(Label label, CardListData cardListData) {
                    this.sectionTitle = label;
                    this.cards = cardListData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CardListData getCards() {
                    return this.cards;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getSectionTitle() {
                    return this.sectionTitle;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MessageSection)) {
                        return false;
                    }
                    MessageSection messageSection = (MessageSection) other;
                    return fr.t.c(this.sectionTitle, messageSection.sectionTitle) && fr.t.c(this.cards, messageSection.cards);
                }

                public int hashCode() {
                    return (this.sectionTitle.hashCode() * 31) + this.cards.hashCode();
                }

                public String toString() {
                    return "MessageSection(sectionTitle=" + this.sectionTitle + ", cards=" + this.cards + ')';
                }
            }

            public DraftMessage(BaseScaffoldData baseScaffoldData, Label label, List<MessageSection> list, ButtonData buttonData, ButtonData buttonData2, er.a<oq.i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerText = label;
                this.messageSections = list;
                this.editDraftButtonData = buttonData;
                this.deleteDraftButtonData = buttonData2;
                this.backAction = aVar;
            }

            public final er.a<oq.i0> a() {
                return this.backAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getDeleteDraftButtonData() {
                return this.deleteDraftButtonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getEditDraftButtonData() {
                return this.editDraftButtonData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getHeaderText() {
                return this.headerText;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DraftMessage)) {
                    return false;
                }
                DraftMessage draftMessage = (DraftMessage) other;
                return fr.t.c(this.baseScaffoldData, draftMessage.baseScaffoldData) && fr.t.c(this.headerText, draftMessage.headerText) && fr.t.c(this.messageSections, draftMessage.messageSections) && fr.t.c(this.editDraftButtonData, draftMessage.editDraftButtonData) && fr.t.c(this.deleteDraftButtonData, draftMessage.deleteDraftButtonData) && fr.t.c(this.backAction, draftMessage.backAction);
            }

            public final List<MessageSection> f() {
                return this.messageSections;
            }

            public int hashCode() {
                return (((((((((this.baseScaffoldData.hashCode() * 31) + this.headerText.hashCode()) * 31) + this.messageSections.hashCode()) * 31) + this.editDraftButtonData.hashCode()) * 31) + this.deleteDraftButtonData.hashCode()) * 31) + this.backAction.hashCode();
            }

            public String toString() {
                return "DraftMessage(baseScaffoldData=" + this.baseScaffoldData + ", headerText=" + this.headerText + ", messageSections=" + this.messageSections + ", editDraftButtonData=" + this.editDraftButtonData + ", deleteDraftButtonData=" + this.deleteDraftButtonData + ", backAction=" + this.backAction + ')';
            }
        }

        /* JADX INFO: renamed from: m12.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm12/e$a$b;", "Lm12/e$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: m12.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm12/e$a$c;", "Lm12/e$a;", "Lx70/a;", "loaderData", "<init>", "(Lx70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx70/a;", "()Lx70/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f122716b = x70.a.f217278b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final x70.a loaderData;

            public Loading(x70.a aVar) {
                this.loaderData = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final x70.a getLoaderData() {
                return this.loaderData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.loaderData, ((Loading) other).loaderData);
            }

            public int hashCode() {
                return this.loaderData.hashCode();
            }

            public String toString() {
                return "Loading(loaderData=" + this.loaderData + ')';
            }
        }

        /* JADX INFO: renamed from: m12.e$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lm12/e$a$d;", "Lm12/e$a;", "Lc30/b;", "alertData", "Lq12/a;", "messageInitialized", "Lmx/a;", "attachmentsHeader", "Ln30/b;", "attachmentsCardListData", "<init>", "(Lc30/b;Lq12/a;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc30/b;", "()Lc30/b;", "b", "Lq12/a;", "d", "()Lq12/a;", "c", "Lmx/a;", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Message implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageInitializedViewState messageInitialized;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label attachmentsHeader;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData attachmentsCardListData;

            public Message(c30.b bVar, MessageInitializedViewState messageInitializedViewState, Label label, CardListData cardListData) {
                this.alertData = bVar;
                this.messageInitialized = messageInitializedViewState;
                this.attachmentsHeader = label;
                this.attachmentsCardListData = cardListData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getAttachmentsCardListData() {
                return this.attachmentsCardListData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getAttachmentsHeader() {
                return this.attachmentsHeader;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final MessageInitializedViewState getMessageInitialized() {
                return this.messageInitialized;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Message)) {
                    return false;
                }
                Message message = (Message) other;
                return fr.t.c(this.alertData, message.alertData) && fr.t.c(this.messageInitialized, message.messageInitialized) && fr.t.c(this.attachmentsHeader, message.attachmentsHeader) && fr.t.c(this.attachmentsCardListData, message.attachmentsCardListData);
            }

            public int hashCode() {
                c30.b bVar = this.alertData;
                int iHashCode = (((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.messageInitialized.hashCode()) * 31) + this.attachmentsHeader.hashCode()) * 31;
                CardListData cardListData = this.attachmentsCardListData;
                return iHashCode + (cardListData != null ? cardListData.hashCode() : 0);
            }

            public String toString() {
                return "Message(alertData=" + this.alertData + ", messageInitialized=" + this.messageInitialized + ", attachmentsHeader=" + this.attachmentsHeader + ", attachmentsCardListData=" + this.attachmentsCardListData + ')';
            }
        }
    }

    oz.j a();
}
