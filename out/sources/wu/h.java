package wu;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003¨\u0006\b"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "elementDescriptors", "", "b", "elementNames", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"wu/h$a", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "hasNext", "()Z", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<SerialDescriptor>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int elementsLeft;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f215106b;

        a(SerialDescriptor serialDescriptor) {
            this.f215106b = serialDescriptor;
            this.elementsLeft = serialDescriptor.p();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f215106b;
            int iP = serialDescriptor.p();
            int i15 = this.elementsLeft;
            this.elementsLeft = i15 - 1;
            return serialDescriptor.r(iP - i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"wu/h$b", "", "", "", "hasNext", "()Z", "a", "()Ljava/lang/String;", "", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Iterator<String>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int elementsLeft;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f215108b;

        b(SerialDescriptor serialDescriptor) {
            this.f215108b = serialDescriptor;
            this.elementsLeft = serialDescriptor.p();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.f215108b;
            int iP = serialDescriptor.p();
            int i15 = this.elementsLeft;
            this.elementsLeft = i15 - 1;
            return serialDescriptor.q(iP - i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"wu/h$c", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Iterable<SerialDescriptor>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f215109a;

        public c(SerialDescriptor serialDescriptor) {
            this.f215109a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<SerialDescriptor> iterator() {
            return new a(this.f215109a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"wu/h$d", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements Iterable<String>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f215110a;

        public d(SerialDescriptor serialDescriptor) {
            this.f215110a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f215110a);
        }
    }

    public static final Iterable<SerialDescriptor> a(SerialDescriptor serialDescriptor) {
        return new c(serialDescriptor);
    }

    public static final Iterable<String> b(SerialDescriptor serialDescriptor) {
        return new d(serialDescriptor);
    }
}
