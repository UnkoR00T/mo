package so0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lso0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lso0/e;", "a", "Lso0/e;", "()Lso0/e;", "category", "", "Lso0/a0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "topics", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryTopicsDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final CategoryDtoDto category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topics")
    private final List<TopicDtoDto> topics;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CategoryDtoDto getCategory() {
        return this.category;
    }

    public final List<TopicDtoDto> b() {
        return this.topics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryTopicsDtoDto)) {
            return false;
        }
        CategoryTopicsDtoDto categoryTopicsDtoDto = (CategoryTopicsDtoDto) other;
        return fr.t.c(this.category, categoryTopicsDtoDto.category) && fr.t.c(this.topics, categoryTopicsDtoDto.topics);
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        List<TopicDtoDto> list = this.topics;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CategoryTopicsDtoDto(category=" + this.category + ", topics=" + this.topics + ')';
    }
}
