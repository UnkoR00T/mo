package so0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lso0/a;", "", "Lso0/l;", "category", "", "description", "topic", "<init>", "(Lso0/l;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lso0/l;", "getCategory", "()Lso0/l;", "b", "Ljava/lang/String;", "getDescription", "c", "getTopic", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddIdeaRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final l category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topic")
    private final String topic;

    public AddIdeaRequestDto(l lVar, String str, String str2) {
        this.category = lVar;
        this.description = str;
        this.topic = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddIdeaRequestDto)) {
            return false;
        }
        AddIdeaRequestDto addIdeaRequestDto = (AddIdeaRequestDto) other;
        return this.category == addIdeaRequestDto.category && fr.t.c(this.description, addIdeaRequestDto.description) && fr.t.c(this.topic, addIdeaRequestDto.topic);
    }

    public int hashCode() {
        return (((this.category.hashCode() * 31) + this.description.hashCode()) * 31) + this.topic.hashCode();
    }

    public String toString() {
        return "AddIdeaRequestDto(category=" + this.category + ", description=" + this.description + ", topic=" + this.topic + ')';
    }
}
