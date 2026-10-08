package ch;

/* JADX INFO: loaded from: classes3.dex */
final class a1 {
    static int a(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
