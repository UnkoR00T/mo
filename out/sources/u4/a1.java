package u4;

import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lu4/a1;", "Lm2/f6;", "", "", "e", "()Z", "cacheable", "b", "a", "Lu4/a1$a;", "Lu4/a1$b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a1 extends f6<Object> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lu4/a1$a;", "Lu4/a1;", "Lm2/f6;", "", "Lu4/g;", "current", "<init>", "(Lu4/g;)V", "a", "Lu4/g;", "getCurrent$ui_text", "()Lu4/g;", "", "e", "()Z", "cacheable", "getValue", "()Ljava/lang/Object;", "value", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a1, f6<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final g current;

        public a(g gVar) {
            this.current = gVar;
        }

        @Override // u4.a1
        /* JADX INFO: renamed from: e */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @Override // p076m2.f6
        public Object getValue() {
            return this.current.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu4/a1$b;", "Lu4/a1;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "e", "()Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean cacheable;

        public b(Object obj, boolean z15) {
            this.value = obj;
            this.cacheable = z15;
        }

        @Override // u4.a1
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // p076m2.f6
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ b(Object obj, boolean z15, int i15, fr.k kVar) {
            this(obj, (i15 & 2) != 0 ? true : z15);
        }
    }

    /* JADX INFO: renamed from: e */
    boolean getCacheable();
}
