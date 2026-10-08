package gw2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gw2.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgw2/g;", "", "Lwx/i;", "pickedFile", "Lgw2/o;", "type", "Lgw2/j;", "fromAction", "<init>", "(Lwx/i;Lgw2/o;Lgw2/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i;", "b", "()Lwx/i;", "Lgw2/o;", "c", "()Lgw2/o;", "Lgw2/j;", "()Lgw2/j;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnFilePicked {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i pickedFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OnPickerActionSelected fromAction;

    public OnFilePicked(wx.i iVar, o oVar, OnPickerActionSelected onPickerActionSelected) {
        this.pickedFile = iVar;
        this.type = oVar;
        this.fromAction = onPickerActionSelected;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OnPickerActionSelected getFromAction() {
        return this.fromAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final wx.i getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnFilePicked)) {
            return false;
        }
        OnFilePicked onFilePicked = (OnFilePicked) other;
        return fr.t.c(this.pickedFile, onFilePicked.pickedFile) && this.type == onFilePicked.type && fr.t.c(this.fromAction, onFilePicked.fromAction);
    }

    public int hashCode() {
        return (((this.pickedFile.hashCode() * 31) + this.type.hashCode()) * 31) + this.fromAction.hashCode();
    }

    public String toString() {
        return "OnFilePicked(pickedFile=" + this.pickedFile + ", type=" + this.type + ", fromAction=" + this.fromAction + ')';
    }
}
