package q12;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q12.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lq12/a;", "", "Li50/a;", "baseScaffoldData", "Lq12/b;", "messageSectionData", "", "Lh30/a;", "listOfBottomMenuButtons", "<init>", "(Li50/a;Lq12/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq12/b;", "c", "()Lq12/b;", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageInitializedViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData baseScaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MessageSectionData messageSectionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ButtonData> listOfBottomMenuButtons;

    public MessageInitializedViewState(BaseScaffoldData baseScaffoldData, MessageSectionData messageSectionData, List<ButtonData> list) {
        this.baseScaffoldData = baseScaffoldData;
        this.messageSectionData = messageSectionData;
        this.listOfBottomMenuButtons = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BaseScaffoldData getBaseScaffoldData() {
        return this.baseScaffoldData;
    }

    public final List<ButtonData> b() {
        return this.listOfBottomMenuButtons;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MessageSectionData getMessageSectionData() {
        return this.messageSectionData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInitializedViewState)) {
            return false;
        }
        MessageInitializedViewState messageInitializedViewState = (MessageInitializedViewState) other;
        return t.c(this.baseScaffoldData, messageInitializedViewState.baseScaffoldData) && t.c(this.messageSectionData, messageInitializedViewState.messageSectionData) && t.c(this.listOfBottomMenuButtons, messageInitializedViewState.listOfBottomMenuButtons);
    }

    public int hashCode() {
        return (((this.baseScaffoldData.hashCode() * 31) + this.messageSectionData.hashCode()) * 31) + this.listOfBottomMenuButtons.hashCode();
    }

    public String toString() {
        return "MessageInitializedViewState(baseScaffoldData=" + this.baseScaffoldData + ", messageSectionData=" + this.messageSectionData + ", listOfBottomMenuButtons=" + this.listOfBottomMenuButtons + ')';
    }
}
