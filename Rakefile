
require 'asciidoctor'
require 'asciidoctor-pdf'

task :default do
  infile = 'src/getting-started-with-mockito.adoc'
  options = {
              :in_place => true,
              :doctype => :book,
              :safe => :server
            }
  
  ['pdf'].each do |format|
    options[:backend] = format
    Asciidoctor.convert_file infile, options
  end
end
