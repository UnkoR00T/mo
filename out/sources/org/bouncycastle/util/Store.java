package org.bouncycastle.util;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface Store<T> {
    Collection<T> getMatches(Selector<T> selector);
}
