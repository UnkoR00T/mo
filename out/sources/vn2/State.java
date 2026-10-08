package vn2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vn2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvn2/b;", "", "", "description", "emailAddress", "", "Lwx/i;", "pickedFiles", "Llm2/b;", "attachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lvn2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "e", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<wx.i> pickedFiles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<lm2.b> attachments;

    /* JADX WARN: Multi-variable type inference failed */
    public State(String str, String str2, List<? extends wx.i> list, List<? extends lm2.b> list2) {
        this.description = str;
        this.emailAddress = str2;
        this.pickedFiles = list;
        this.attachments = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, String str, String str2, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.description;
        }
        if ((i15 & 2) != 0) {
            str2 = state.emailAddress;
        }
        if ((i15 & 4) != 0) {
            list = state.pickedFiles;
        }
        if ((i15 & 8) != 0) {
            list2 = state.attachments;
        }
        return state.a(str, str2, list, list2);
    }

    public final State a(String description, String emailAddress, List<? extends wx.i> pickedFiles, List<? extends lm2.b> attachments) {
        return new State(description, emailAddress, pickedFiles, attachments);
    }

    public final List<lm2.b> c() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.description, state.description) && t.c(this.emailAddress, state.emailAddress) && t.c(this.pickedFiles, state.pickedFiles) && t.c(this.attachments, state.attachments);
    }

    public final List<wx.i> f() {
        return this.pickedFiles;
    }

    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        String str = this.emailAddress;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pickedFiles.hashCode()) * 31) + this.attachments.hashCode();
    }

    public String toString() {
        return "State(description=" + this.description + ", emailAddress=" + this.emailAddress + ", pickedFiles=" + this.pickedFiles + ", attachments=" + this.attachments + ')';
    }
}
