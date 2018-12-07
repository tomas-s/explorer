package worldexplorer.repository.custom_operations;

import worldexplorer.entity.Quote;
import worldexplorer.entity.Value;

public interface QuoteOperation {
    void assignValueToQuote(Quote quote, Value value);
}
