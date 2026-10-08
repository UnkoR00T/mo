package fu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lfu/i;", "", "", "", "string", "<init>", "(Ljava/lang/CharSequence;)V", "", "hasNext", "()Z", "a", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "", "b", "I", "state", "c", "tokenStartIndex", "d", "delimiterStartIndex", "e", "delimiterLength", "f", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class i implements Iterator<String>, gr.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f67074f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence string;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tokenStartIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int delimiterStartIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int delimiterLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lfu/i$a;", "", "<init>", "()V", "", "UNKNOWN", "I", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public i(CharSequence charSequence) {
        this.string = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        int i15 = this.delimiterStartIndex;
        int i16 = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterLength + i15;
        return this.string.subSequence(i16, i15).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i15;
        int i16;
        int i17 = this.state;
        if (i17 != 0) {
            return i17 == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        int length = this.string.length();
        int length2 = this.string.length();
        for (int i18 = this.tokenStartIndex; i18 < length2; i18++) {
            char cCharAt = this.string.charAt(i18);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i15 = (cCharAt == '\r' && (i16 = i18 + 1) < this.string.length() && this.string.charAt(i16) == '\n') ? 2 : 1;
                length = i18;
                this.state = 1;
                this.delimiterLength = i15;
                this.delimiterStartIndex = length;
                return true;
            }
        }
        i15 = -1;
        this.state = 1;
        this.delimiterLength = i15;
        this.delimiterStartIndex = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
